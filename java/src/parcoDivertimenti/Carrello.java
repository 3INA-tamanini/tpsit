import java.util.concurrent.Semaphore;

public class Carrello extends Thread {
    private static int passeggeriABordo = 0;  // Numero di passeggeri attuali nel carrello
    private static Semaphore pieno;  // Semaforo che indica quanti passeggeri sono saliti
    private static Semaphore vuoto;  // Semaforo che indica quanti posti sono liberi // Semaforo che permette lo scarico dei passeggeri

    private int capacita;

    public Carrello(Semaphore pieno, Semaphore vuoto, int capacita) {
        Carrello.pieno = pieno;
        Carrello.vuoto = vuoto;
        this.capacita = capacita;
    }

    private void riempi() throws InterruptedException {
        vuoto.acquire();

            passeggeriABordo++;
            System.out.println("un passeggero è salito sul carrello");
            if(passeggeriABordo==capacita)
                System.out.println("carrello pieno");

        pieno.release();
    }

    private void svuota() throws InterruptedException {
        pieno.acquire();
        
            passeggeriABordo--;
            System.out.println("un passeggero è sceso dal carrello");
        if(passeggeriABordo==0)
            System.out.println("il carrello è vuoto");

        vuoto.release();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < capacita; i++) {
                riempi();
            }
            System.out.println("il carrello parte");
            Thread.sleep(2000);
            System.out.println("il carrello è arrivato");
            for (int i = 0; i < capacita; i++) {
                svuota();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
