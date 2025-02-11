import java.util.Random;

public class Gara2 extends Thread {
    private String nome;
    private int distanza;

    public Gara2(String nome, int distanza) {
        this.nome = nome;
        this.distanza = distanza;
    }

    @Override

    public void run() {
        int place = 0;
        Random r = new Random();
        while (place < distanza) {
            System.out.println(nome + " ha percorso " + place + "m" + " su " + distanza + "m");
            place = place + r.nextInt(20);
        }

        System.out.println(nome + " è arrivato");

    }
}
