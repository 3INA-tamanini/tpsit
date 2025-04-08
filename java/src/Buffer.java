import java.util.concurrent.Semaphore;

// Classe che rappresenta il buffer condiviso tra produttore e consumatore
public class Buffer {
    private final int[] buffer = new int[5]; // buffer circolare
    private int in = 0, out = 0; // indici di scrittura e lettura
    // Semaforo che conta quanti slot sono vuoti (inizialmente tutti)
    private final Semaphore vuoti = new Semaphore(5);
    // Semaforo che conta quanti slot sono pieni (inizialmente nessuno)
    private final Semaphore pieni = new Semaphore(0);
    private final Object lock = new Object(); // per sincronizzazione tra i thread
    // Metodo chiamato dal produttore

    public void produci(int dato) throws InterruptedException {
        vuoti.acquire(); // aspetta uno slot vuoto
        synchronized (lock) {
            buffer[in] = dato;
            in = (in + 1) % buffer.length;
            System.out.println("Prodotto: " + dato);
        }
        pieni.release(); // segnala che un nuovo dato è disponibile
    }

    // Metodo chiamato dal consumatore
    public int consuma() throws InterruptedException {
        pieni.acquire(); // aspetta che ci sia un dato
        int dato;
        synchronized (lock) {
            dato = buffer[out];
            out = (out + 1) % buffer.length;
            System.out.println("Consumato: " + dato);
        }
        vuoti.release(); // segnala che uno slot è libero
        return dato;
    }
}