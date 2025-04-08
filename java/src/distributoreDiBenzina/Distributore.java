package distributoreDiBenzina;

import java.util.concurrent.Semaphore;

public class Distributore {
    private final int[] buffer = new int[5]; // buffer circolare
    private int out = 0;

    private final Semaphore vuoti = new Semaphore(4);

    private final Semaphore disponibili = new Semaphore(0);


    private final Object lock = new Object();


    public int consuma() throws InterruptedException {
        disponibili.acquire();

        int dato;
        synchronized (lock) {
            dato = buffer[out];
            out = (out + 1) % buffer.length;
            System.out.println("Consumato: " + dato);
        }

        vuoti.release();

        return dato;
    }
}


