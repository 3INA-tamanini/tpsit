import java.util.Random;

public class corsaCiclisti extends Thread {

    private int distanza;
    private static int posto = 1;

    public corsaCiclisti( int distanza) {
        this.distanza = distanza;
    }

    @Override
    public void run() {
        while (distanza > 0) {
            try {
                Random r = new Random();
                int distanzaPercorsa = r.nextInt(50) + 1;
                distanza = distanza - distanzaPercorsa;
                if (distanza < 0) {
                    distanza = 0;
                }
                System.out.println(getName() + " ha corso " + distanza);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " ha terminato ");
        System.out.println(getName() + " posto in podio " + posto++);
    }
}
