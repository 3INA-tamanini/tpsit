package lettoriScrittori;

import java.util.concurrent.Semaphore;
import java.util.Random;

public class LettoriScrittori extends Thread {

    private final Semaphore mutex = new Semaphore(1);
    public int readers_count = 0;
    private final Semaphore semaphore_writers = new Semaphore(1);

    private final Object lock = new Object();

    public LettoriScrittori() {
    }

    public void lettura() throws InterruptedException {
        mutex.acquire();

        synchronized (lock) {
            readers_count++;
            if (readers_count == 1) {
                semaphore_writers.acquire();
            }

        }

        mutex.release();
    }

    public void fineLettura() throws InterruptedException {
        mutex.acquire();

        synchronized (lock) {
            readers_count--;
            if (readers_count == 0) {
                semaphore_writers.release();
            }

        }

        mutex.release();
    }

    public void scrittura() throws InterruptedException {

        semaphore_writers.acquire();

    }

    public void fineScrittura() throws InterruptedException {
        semaphore_writers.release();

    }

    @Override
    public void run() {
        int cont = 2;
        while (cont != 0) {
            try {
                Random r = new Random();
                int a = r.nextInt(1) + 1;
                if (a == 1) {
                    lettura();
                    System.out.println(Thread.currentThread().getName() + " sta leggendo");
                    Thread.sleep(500);
                    fineLettura();
                    a++;
                    cont--;
                    System.out.println(Thread.currentThread().getName() + " ha finito di leggere");
                }
                if (a == 2) {
                    scrittura();
                    System.out.println(Thread.currentThread().getName() + " sta scrivendo");
                    Thread.sleep(500);
                    fineScrittura();
                    System.out.println(Thread.currentThread().getName() + " ha finito di scrivere");
                    a--;
                    cont--;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
