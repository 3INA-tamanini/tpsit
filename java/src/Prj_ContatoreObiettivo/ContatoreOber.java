package Prj_ContatoreObiettivo;

public class ContatoreOber { //classe contatore
    static int n;

    public ContatoreOber(int in) { 
        n=in;
    }
    
    synchronized static int incrementa(){ //metodo incrementa
        System.out.println( n);
        n++; //incrementa il valore
        return n;
    }
    
}
