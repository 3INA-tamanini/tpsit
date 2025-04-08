public class MainIncrocio {
    public static void main(String[] args) {
        Semaforo incrocio1 = new Semaforo(1);
        Semaforo incrocio2 = new Semaforo(0);
        Semaforo incrocio3 = new Semaforo(0);
        Semaforo incrocio4 = new Semaforo(0);
        Thread i1 = new Thread(new Macchina1("Mercedes", incrocio1, incrocio2, incrocio3, incrocio4));
        Thread i2 = new Thread(new Macchina2("Audi",incrocio1, incrocio2, incrocio3, incrocio4));
        Thread i3 = new Thread(new Macchina3("Tesla",incrocio1, incrocio2, incrocio3, incrocio4));
        Thread i4 = new Thread(new Macchina4("Ferrari",incrocio1, incrocio2, incrocio3, incrocio4));
        i1.start();
        i2.start();
        i3.start();
        i4.start();
    }
    
}
