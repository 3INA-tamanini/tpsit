package barbiere;

import java.util.concurrent.Semaphore;

// Classe Barbiere
public class Barbiere extends Thread {
    private Semaphore semaforoPoltrona;
    private Semaphore semaforoDormire;

    // Costruttore: riceve i semafori come parametri
    public Barbiere(Semaphore semaforoPoltrona, Semaphore semaforoDormire) {
        this.semaforoPoltrona = semaforoPoltrona;
        this.semaforoDormire = semaforoDormire;
    }

    public void run() {
        while (true) {
            try {
                semaforoDormire.acquire(); // Attende che un cliente lo svegli
                System.out.println("Il barbiere taglia i capelli...");
                Thread.sleep(2000); // Simula il tempo di taglio
                semaforoPoltrona.release(); // Libera la poltrona
                System.out.println("torna a dormire");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}