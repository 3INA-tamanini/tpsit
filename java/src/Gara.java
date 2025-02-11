import java.util.Random;
 
public class Gara extends Thread { 
    private String nome; 
 
    public Gara(String nome) { 
        this.nome = nome; 
    } 
 
    @Override
    public void run() {
        // istanza di Random per i numeri casuali
        Random r = new Random();
        System.out.println(nome + " corre");
        try {
            // metto il thread in sleep per un numero casuale di secondi tra 1 e 3
            Thread.sleep(r.nextInt(3) * 1000);
            System.out.println(nome + " terminato");
        } catch (InterruptedException ex) {
            System.out.println("Interrotto durante lo sleep.");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // instanzo 2 thread
        Gara thread1 = new Gara("Thhead 1");
        Gara thread2 = new Gara("Thread 2");

        try {
            // avvio i thread
            thread1.start();
            thread2.start();
            // aspetto la fine del primo thread
            thread1.join();
            // aspetto la fine del secondo thread
            thread2.join();
            // termina il programma
            System.out.println("Gara terminata!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}