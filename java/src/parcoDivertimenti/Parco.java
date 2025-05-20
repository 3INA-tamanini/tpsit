import java.util.concurrent.Semaphore;

public class Parco{
    public static void main(String[] args) {
        int capacita = 10; 
        Semaphore pieno = new Semaphore(0);
        Semaphore vuoto = new Semaphore(capacita);

        // Avvia il carrello (thread)
        Carrello carrello = new Carrello(pieno, vuoto, capacita);
        carrello.start();
    }
}