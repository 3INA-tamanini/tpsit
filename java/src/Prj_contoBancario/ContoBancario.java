package Prj_ContoBancario;

public class ContoBancario extends Thread {

    private static int saldo;                       //variabile condivisa
    private int importo;                            //variabile da sottrarre alla variabile condivisa

    public ContoBancario(int saldo, int importo) { //costruttore
        this.saldo = saldo;
        this.importo = importo;
    }

    @Override
    public void run() {
        if (saldo - importo >= 0) {                   //controllo che sia possibile prelevare l'importo senza andare in negativo
            saldo = saldo - importo;
            System.out.println(getName() + " saldo = " + saldo);
        } else {
            System.out.println(getName() + " SALDO NEGATIVO");
        }
    }
}
