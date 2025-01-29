public class Countdown extends Thread{
    
    private int valore;

    public Countdown(int valore){
        this.valore = valore;
    }

    public void run(){
        for (int i = valore; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) throws InterruptedException {
        Countdown s1 = new Countdown(10);
        Countdown s2 = new Countdown(8);
        Countdown s3 = new Countdown(9);

        s1.start();
        s1.join();
        s2.start();
        s2.join() ;   
        s3.start();
        s3.join();    
    }
}
