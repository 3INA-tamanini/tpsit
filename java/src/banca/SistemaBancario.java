package banca;

import java.util.concurrent.Semaphore;
import java.util.Random;

public class SistemaBancario extends Thread {

    private final Semaphore mutex = new Semaphore(1);
    public int readers_count = 0;
    private final Semaphore operatori = new Semaphore(1);

    private final Object lock = new Object();

    static int conto;

    public SistemaBancario() {
    }

    public void lettura() throws InterruptedException {
        mutex.acquire();

        synchronized (lock) {
            readers_count++;
            if (readers_count == 1) {
                operatori.acquire();
            }
            

        }

        mutex.release();
    }

    public void fineLettura() throws InterruptedException {
        mutex.acquire();

        synchronized (lock) {
            readers_count--;
            if (readers_count == 0) {
                operatori.release();
            }

        }

        mutex.release();
    }

    public void scrittura() throws InterruptedException {

        operatori.acquire();
        Random r = new Random();
        conto = r.nextInt(readers_count);

    }

    public void fineScrittura() throws InterruptedException {
        operatori.release();

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
