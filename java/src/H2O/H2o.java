package H2O;

import java.util.concurrent.Semaphore;

public class H2o extends Thread {
    private final Semaphore s1 = new Semaphore(1);
    private final Semaphore s2 = new Semaphore(2);

    public H2o() {

    }

    public void ossigeno() throws InterruptedException {
        s1.acquire();
        System.out.print("O");
        s2.release(2);
    }

    public void idrogeno() throws InterruptedException {
        s2.acquire();
        System.out.print("H");
        s1.release();
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i<3;i++) {
                idrogeno();
                ossigeno();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
