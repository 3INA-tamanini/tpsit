public class Macchina3 implements Runnable {

    private Semaforo incrocio1;
    private Semaforo incrocio2;
    private Semaforo incrocio3;
    private Semaforo incrocio4;
    private String macchina;

    public Macchina3(String macchina, Semaforo incrocio1, Semaforo incrocio2, Semaforo incrocio3, Semaforo incrocio4) {
        this.macchina = macchina;
        this.incrocio1 = incrocio1;
        this.incrocio2 = incrocio2;
        this.incrocio3 = incrocio3;
        this.incrocio4 = incrocio4;
    }

    @Override
    public void run() {
        incrocio3.P();
        System.out.println(macchina + " sta partendo.");
        incrocio2.V();
    }
}
