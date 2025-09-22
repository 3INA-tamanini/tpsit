package Prj_PariDispari;

public class DispariThread extends Thread {

    private final Object lock;

    //costruttore
    public DispariThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        //sincronizzazione tra processi
        synchronized (lock) {
            try {
                //stampa i numeri dispari da 0 a 20
                for (int i = 1; i <= 20; i = i + 2) {
                    System.out.print(i + " ");
                    lock.notify();
                    lock.wait();
                }

            } catch (Exception e) {
            }
        }

    }

}
