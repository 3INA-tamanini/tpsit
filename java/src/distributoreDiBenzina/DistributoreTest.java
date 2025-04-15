
package distributoreDiBenzina;

public class DistributoreTest {

    public static void main(String[] args) {

        int numThreads = 4;

        Distributore d = new Distributore();

        for (int i = 0; i < numThreads; i++) {

            Automobile1 a = new Automobile1(d);

            a.setName("Auto-" + i);

            a.start();

        }

    }

}
