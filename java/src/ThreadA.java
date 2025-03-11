public class ThreadA implements Runnable {


    private Object lock;
    public ThreadA(Object lock){
        this.lock = lock;
    }
    @Override

    public void run(){
        synchronized(lock){
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("A");
                    lock.notify();
                    lock.wait();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


