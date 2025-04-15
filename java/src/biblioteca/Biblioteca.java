package biblioteca;


import java.util.concurrent.Semaphore;

import java.util.Random;


public class Biblioteca extends Thread {


private final Semaphore m = new Semaphore(1);

private final Semaphore m1 = new Semaphore(1);

private final Semaphore m2 = new Semaphore(1);

private final Semaphore s = new Semaphore(1);

public int numLettori = 0;

public int numScrittori = 0;


private final Object lock = new Object();


public Biblioteca() {

}


public void lettura() throws InterruptedException {

     m.acquire();


     synchronized (lock) {

         numLettori++;

         if (numLettori == 1) {

             s.acquire();

         }


     }


     m.release();

}


public void fineLettura() throws InterruptedException {

     m.acquire();


     synchronized (lock) {

         numLettori--;

         if (numLettori == 0) {

             s.release();

         }


     }


     m.release();

}


public void scrittura() throws InterruptedException {

     m2.acquire();


     synchronized (lock) {

         numScrittori++;

         if (numScrittori == 1) {

             s.acquire();

         }


     }


     m2.release();

     m1.acquire();

}


public void fineScrittura() throws InterruptedException {

     m1.release();


     synchronized (lock) {

         numScrittori--;

         if (numScrittori == 0) {

             s.release();

         }


     }


     m2.release();

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

