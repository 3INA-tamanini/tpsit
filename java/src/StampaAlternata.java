public class StampaAlternata {
    public static void main(String[] args) {
    Object lock = new Object();
    new Thread(new ThreadA(lock)).start();
    new Thread(new ThreadB(lock)).start();
    }
    }