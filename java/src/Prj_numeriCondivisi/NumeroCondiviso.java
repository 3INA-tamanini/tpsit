package Prj_numeriCondivisi;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NumeroCondiviso {

    private int numero = 1;
    private final int max = 20;

    public synchronized void StampaPari() {
        while (numero != max) {
            if (numero % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(NumeroCondiviso.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("pari: " + numero);
                numero++;
                notifyAll();
            }
        }
    }

    public synchronized void StampaDispari() {
        while (numero != max) {
            if (numero % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(NumeroCondiviso.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("dispari: " + numero);
                numero++;
                notifyAll();
            }
        }
    }
}
