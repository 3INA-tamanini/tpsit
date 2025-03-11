public class MyRunnableTest {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread thread = new Thread(r);
        thread.start();
    }
}
