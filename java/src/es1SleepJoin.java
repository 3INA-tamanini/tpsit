public class Es1SleepJoin extends Thread {
    private String nome;
    private int pausa;
    public Es1SleepJoin(String nome, int pausa){
        this.nome = nome;
        this.pausa = pausa;
    }
    
    @Override
    public void run(){
        System.out.println(nome + " in esecuzione");
        try {
            Thread.sleep(pausa);
        } catch (InterruptedException e) {
            System.out.println(nome + " dorme");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Es1SleepJoin t1 = new Es1SleepJoin("Thread 1", 2000);
        Es1SleepJoin t2 = new Es1SleepJoin("Thread 2", 1000);

        t1.start();
        t2.start();

        try {
            t1.join();
            System.out.println("Thread 1 terminato");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        try {
            t2.join();
            System.out.println("Thread 2 terminato");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println("fine programma");
    }
}
