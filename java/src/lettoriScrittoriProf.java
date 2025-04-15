import java.util.concurrent.Semaphore;

class LettoriScrittoriProf {
    // Semafori
    private Semaphore mutex = new Semaphore(1); // per il controllo della sezione critica
    private Semaphore semaphore_writers = new Semaphore(1); // per il controllo degli scrittori
    private int readers_count = 0; // per tenere traccia dei lettori attivi

    // Metodo per i lettori
    public void read(int readerId) {
        try {
            // Inizio della sezione critica per i lettori
            mutex.acquire();
            readers_count++;
            if (readers_count == 1) {
                // Se è il primo lettore, deve aspettare che non ci siano scrittori
                semaphore_writers.acquire();
            }
            mutex.release();

            // Lettura dalla risorsa condivisa
            System.out.println("Lettore " + readerId + " sta leggendo.");

            // Fine della lettura
            mutex.acquire();
            readers_count--;
            if (readers_count == 0) {
                // Se non ci sono più lettori, permetti agli scrittori di scrivere
                semaphore_writers.release();
            }
            mutex.release();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Metodo per gli scrittori
    public void write(int writerId) {
        try {
            // Gli scrittori devono avere l'accesso esclusivo
            semaphore_writers.acquire();

            // Scrittura sulla risorsa condivisa
            System.out.println("Scrittore " + writerId + " sta scrivendo.");

            // Fine della scrittura
            semaphore_writers.release();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}