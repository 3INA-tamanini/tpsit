package Prj_PariDispari;

public class PariDispariMain {
    public static void main(String[] args) {
        //creazione oggetto lock
        Object lock = new Object();
        //istanziare i thread
        PariThread p = new PariThread(lock);
        DispariThread d = new DispariThread(lock);
        //avviare i thread
        
        p.start();
        d.start();
    }
}
