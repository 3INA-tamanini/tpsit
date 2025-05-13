package piscina;

import java.util.concurrent.Semaphore;

public class PiscinaTest {
    public static void main(String[] args) {
        Semaphore piena = new Semaphore(0);
        Semaphore mutex = new Semaphore(1);

        for (int i = 0; i < 10; i++) {
            new Piscina(piena, mutex).start();
        }
    }
}
