package Prj_ContatoreObiettivo;

public class ContatoreCondivisoMain {

    public static void main(String[] args) { //metodo main
        ContatoreOber c = new ContatoreOber(1); //istanza del contatore
        Runnable Incrementatore = new Incrementatore(c); //istanza dell'incrementatore
        //crea 2 thread da avviare per verificare che si incrementi bene
        Thread contatoreCondiviso = new Thread(Incrementatore); 
        Thread contatoreCondiviso2 = new Thread(Incrementatore);
        //avvia i 2 thread
        contatoreCondiviso.start();
        contatoreCondiviso2.start();
    }
}