package Prj_numeriCondivisi;
public class Pari extends Thread{
    private NumeroCondiviso numeroCondiviso;

    public Pari(NumeroCondiviso numeroCondiviso) {
        this.numeroCondiviso = numeroCondiviso;
    }

    @Override
    public void run() {
        numeroCondiviso.StampaPari();
    }

}
