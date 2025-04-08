public class Semaforo {

    private int valore;

    public Semaforo(int valore) {
        this.valore = valore;
    }

    synchronized public void P() {
        while (valore == 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        valore--;
    }

    synchronized public void V() {
        valore++;
        notify();
    }
}
