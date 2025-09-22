package Prj_stampaNumeri;

import distributoreDiBenzina.Automobile1;

public class ThreadRunnableMain {

    public static void main(String[] args) {
        Runnable MioRunnable = new MioRunnable();
        
        Thread uno = new Thread(MioRunnable);
        Thread due = new Thread(MioRunnable);
        MioThread tre = new MioThread();
        MioThread quattro = new MioThread();
        
        
        uno.start();
        
        due.start();
        tre.start();
        quattro.start();
    }

}
