
public class StampaNumeri implements Runnable{
    private int inizio;
    private int fine;
    
    public StampaNumeri(int inizio, int fine) {
         this.inizio = inizio;
         this.fine = fine;
    }
        
    @Override
    public void run(){
         for(int i = inizio; i <= fine; i++){
             System.out.println(i);
             try {
                 Thread.sleep(100);
             } catch (InterruptedException e) {
                 System.err.println("Thread interrotto");
             }
         }
    }
    
    public static void main(String[] args) {
         StampaNumeri s = new StampaNumeri(1, 10);
         StampaNumeri s1 = new StampaNumeri(11, 20);
         StampaNumeri s2 = new StampaNumeri(21, 30);
         
         Thread t = new Thread(s);
         Thread t1 = new Thread(s1);
         Thread t2 = new Thread(s2);
         
         t.start();
         t1.start();
         t2.start();
         
         try {
             t.join();
             t1.join();
             t2.join();
         } catch (InterruptedException e) {
             System.err.println("Thread interrotto durante il join");
         }
    }
        
    }
    
    