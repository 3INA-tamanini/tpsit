package distributoreDiBenzina;


import java.util.Random;


public class Automobile1 extends Thread{

private Distributore distributore;


public Automobile1(Distributore distributore) {

     this.distributore=distributore;

}

    

public void run(){

     if(Distributore.P.availablePermits() == 0){

         System.out.println(Thread.currentThread().getName() + " sta aspettando");

     }

     

     Random r = new Random();

     int n = r.nextInt(31)+20;

     

     try {

         while (Distributore.totale - n >= 0) {

             distributore.usaPompa();

             distributore.liberaPompa();          

         }

     } catch (Exception e) {

         e.printStackTrace();

     }

     

}

    

}
