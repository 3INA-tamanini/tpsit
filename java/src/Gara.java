import java.util.Random;

public class Gara extends Thread {
    private String nome;

    public Gara(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        Random r = new Random();
        System.out.println(nome + " corre");
        try {
            Thread.sleep(r.nextInt(3) * 1000);
        } catch (InterruptedException ex) {
            System.out.println("Interrotto durante lo sleep.");
            ex.printStackTrace();
        }
        System.out.println(nome + " ha finito!");
    }

    public static void main(String[] args) {
        Gara thread1 = new Gara("Thread 1");
        Gara thread2 = new Gara("Thread 2");

        try {
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            System.out.println("Gara terminata!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}