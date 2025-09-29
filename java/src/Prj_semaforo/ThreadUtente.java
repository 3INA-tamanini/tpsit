package Prj_semaforo;

import java.util.concurrent.Semaphore; //importa il semaforo


public class ThreadUtente extends Thread{
    int numeroThread; 
    
    private static final Semaphore s = new Semaphore(3); //istanza del semaforo

    public ThreadUtente(int n) { //costruttore
        numeroThread = n;
    }

    
    @Override
    public void run() { //metodo run
        try {
            
            s.acquire(); //primitiva P
            RisorsaCondivisa.UsaRisorsa(getName()+" "); //usa la risorsa
            s.release(); //privimiva V
        } catch (InterruptedException ex) {
        }
    }
    
    
    
}
