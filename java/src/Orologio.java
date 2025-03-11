import java.time.LocalTime;

public class Orologio implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Thread threadOrologio = new Thread(new Orologio());
        threadOrologio.start();
        try {
            threadOrologio.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
