public class IsAlive extends Thread {
    private int pausa;

    public IsAlive(int pausa) {
        this.pausa = pausa;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(pausa);
        } catch (InterruptedException ex) {
            System.out.println("Interrotto durante lo sleep.");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //instanzo il thread
        IsAlive thread1 = new IsAlive(3000);
        try {
            //avvio il thread
            thread1.start();

            //controllo se il thread è ancora in esecuzione
            while (thread1.isAlive()) {
                System.out.println("Thread in esecuzione");
                sleep(1000);
            }
            //aspetto la fine del thread
            thread1.join();
            System.out.println("Thread terminato");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}