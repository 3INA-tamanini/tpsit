package barbiere;

import java.util.concurrent.Semaphore;

public class Cliente extends Thread {
    private Semaphore semaforoPoltrona;
    private Semaphore semaforoDormire;
    private String nome;

    public Cliente(String nome, Semaphore semaforoPoltrona, Semaphore semaforoDormire) {
        this.semaforoPoltrona = semaforoPoltrona;
        this.semaforoDormire = semaforoDormire;
        this.nome = nome;
    }

    public void run(){
        while (true) {
            try {
                semaforoPoltrona.acquire();
                System.out.println(nome + " aspetta il taglio");
                semaforoDormire.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    
}
