package Prj_semaforo;

import java.util.Random;

public class RisorsaCondivisa {
    
    
    public static void UsaRisorsa(String s) throws InterruptedException{ //metodo per usare la risorsa
        System.out.println(s + "usa risorsa");
        Random r = new Random();
        Thread.sleep(r.nextInt(2000)); //usa la risorsa
        System.out.println(s + "fine risorsa");
    }
    
}
