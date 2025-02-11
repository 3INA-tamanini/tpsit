import java.util.Scanner;

public class corsaCiclistiTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("inserisci la distanza da percorrere: ");
        int distanza = in.nextInt();
        corsaCiclisti c1 = new corsaCiclisti(distanza);
        corsaCiclisti c2 = new corsaCiclisti(distanza);
        corsaCiclisti c3 = new corsaCiclisti(distanza);
        corsaCiclisti c4 = new corsaCiclisti(distanza);
        corsaCiclisti c5 = new corsaCiclisti(distanza);
        corsaCiclisti c6 = new corsaCiclisti(distanza);

        try {
            c1.start();
            c2.start();
            c3.start();
            c4.start();
            c5.start();
            c6.start();

            c1.join();
            if (c1.isAlive()) {
                System.out.println("vince" + c1.getName());
            }
            c2.join();
            if (c2.isAlive()) {
                System.out.println("vince" + c2.getName());
            }
            c3.join();
            if (c3.isAlive()) {
                System.out.println("vince" + c3.getName());
            }
            c4.join();
            if (c4.isAlive()) {
                System.out.println("vince" + c4.getName());
            }
            c5.join();
            if (c5.isAlive()) {
                System.out.println("vince" + c5.getName());
            }
            c6.join();
            if (c6.isAlive()) {
                System.out.println("vince" + c6.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        in.close();
    }
}
