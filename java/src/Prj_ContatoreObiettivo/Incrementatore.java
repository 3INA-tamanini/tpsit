package Prj_ContatoreObiettivo;


public class Incrementatore implements Runnable { //classe Incrementatore per incrementare. implementa runnable
    
    ContatoreOber c;

    public Incrementatore(ContatoreOber c) { //costruttore
        this.c=c;
    }
    
    

    @Override
    public void run() { //metodo run
        try {
            //incrementa 5 volte con 200 ms di tempo da un incremento all'altro
            for (int i = 0; i < 5; i++) {
                c.incrementa();
                Thread.sleep(200);
                
            }
        } catch (InterruptedException ex) {
        }

    }

}
