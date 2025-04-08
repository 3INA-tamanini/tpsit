package distributoreDiBenzina;

import java.util.Random;

public class DistributoreMain {

    static class Auto extends Thread {
        private final Distributore d;

        public Auto(Distributore d) {
            this.d = d;
        }

        public void run() {
            Random r = new Random();
            int benzina = 0;
            while (benzina<20) {
                 benzina = r.nextInt(50)+1;
            }
            try {
                    System.out.println(getName() + " ha riempito di " + benzina + " litri il serbatoio");
                    
                    d.consuma();
                    Thread.sleep(benzina*10);benzina = 0;
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Distributore d = new Distributore();

        Auto c = new Auto(d);

        c.start();
    }
}