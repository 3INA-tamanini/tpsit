package Prj_ContoBancario;

public class ContoBancarioMain {

    private static int saldo = 82;

    public static void main(String[] args) {

        ContoBancario c1 = new ContoBancario(saldo, 23);    //Istanza del primo Thread
        ContoBancario c2 = new ContoBancario(saldo, 58);    //Istanza del secondo Thread

        c1.start();                                         //Avvio Thread 1
        c2.start();                                         //Avvio Thread 2

        try {
            c1.join();                                      //Il secondo Thread attende il termine del primo per poter iniziare
            c2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
