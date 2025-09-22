package Prj_numeriCondivisi;
public class Dispari extends Thread{
    private NumeroCondiviso numeroCondiviso;

    public Dispari(NumeroCondiviso numeroCondiviso) {
        this.numeroCondiviso = numeroCondiviso;
    }

    @Override
    public void run() {
        numeroCondiviso.StampaDispari();
    }

    


    
    
}
