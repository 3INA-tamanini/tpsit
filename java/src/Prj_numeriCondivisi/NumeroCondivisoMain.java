package Prj_numeriCondivisi;

public class NumeroCondivisoMain {
    
    public static void main(String[] args) {
        NumeroCondiviso nc = new NumeroCondiviso();
        
        Dispari t = new Dispari(nc);
        Pari t2 = new Pari(nc);
        
        t.start();
        t2.start();
    }
    
    
    
}
