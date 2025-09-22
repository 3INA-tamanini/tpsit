package Prj_stampaNumeri;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MioRunnable implements Runnable {
//costruttore

    public MioRunnable() {
    }

    @Override
    public void run() {

        //stampa i numeri da 1 a 5 con 300 millisecondi di delay ma con runnable
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print(i + 1 + " ");
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(MioThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        System.out.println("");
    }

}
