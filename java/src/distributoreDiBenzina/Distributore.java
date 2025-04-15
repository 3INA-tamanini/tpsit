package distributoreDiBenzina;


import java.util.Random;


import java.util.concurrent.Semaphore;


public class Distributore extends Thread {


public static Semaphore P = new Semaphore(2);


public static Semaphore V = new Semaphore(0);


public static int totale = 2000;


private final Object lock = new Object();

    


public Distributore() {

}


public void usaPompa() throws InterruptedException {

     P.acquire();


     synchronized (lock) {

         

         Random r = new Random();

             int benzinaUsata = r.nextInt(50) + 1;

             if (benzinaUsata >= 20 || benzinaUsata > totale) {

                 benzinaUsata = r.nextInt(50) + 1;

             }

             

             if (benzinaUsata > totale) {

                 benzinaUsata = totale;

             }

             totale = totale - benzinaUsata;

             System.out.println(Thread.currentThread().getName() + " sta usando la pompa di benzina");

             Thread.sleep(100);

             System.out.println(Thread.currentThread().getName() + " sta prelevando " + benzinaUsata + " litri");

             System.out.println(" rimango " + totale + " litri di benzina");


     }


     V.release();

}

    

public void liberaPompa() throws InterruptedException{

     V.acquire();

     System.out.println(Thread.currentThread().getName() + " ha finito");

     P.release();

}


@Override

public void run() {

     while (totale > 0) {

         try {

             usaPompa();


         } catch (InterruptedException e) {

             e.printStackTrace();

         }

     }

         System.out.println("finita la benzina");

     

}

 

}

