public class SommaNumeri extends Thread {
    
    private int inizio,fine;

    public SommaNumeri(int inizio, int fine){
        this.inizio = inizio;
        this.fine = fine;
    }

    private int somma(){
        int somma=0;
        for (int i = inizio; i <= fine; i++) {
            somma+=i;
        }

        return somma;
    }
    @Override
    public void run(){
        try {
            System.out.println("la somma dei numeri da " + inizio + " e " + fine + " è: " + somma());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        SommaNumeri s1 = new SommaNumeri(1,50);
        SommaNumeri s2 = new SommaNumeri(51,100);

        s1.start();
        s1.join();
        s2.start();
        s2.join();
    }
}
