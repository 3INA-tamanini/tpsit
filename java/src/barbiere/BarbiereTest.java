package barbiere;

import java.util.concurrent.Semaphore;

public class BarbiereTest {

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaforoPoltrona = new Semaphore(1);
        Semaphore semaforoBarbiere = new Semaphore(0);
        Barbiere b = new Barbiere(semaforoPoltrona, semaforoBarbiere);
        Cliente c1 = new Cliente("c1",semaforoPoltrona, semaforoBarbiere);
        Cliente c2 = new Cliente("c2",semaforoPoltrona, semaforoBarbiere);
        Cliente c3 = new Cliente("c3",semaforoPoltrona, semaforoBarbiere);
        Cliente c4 = new Cliente("c4",semaforoPoltrona, semaforoBarbiere);


        b.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();

        
    }

}
