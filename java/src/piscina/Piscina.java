package piscina;

import java.util.concurrent.Semaphore;

public class Piscina extends Thread {

    private Semaphore piena;
    private Semaphore mutex;
    private static int numPersone = 0;
    private static int capacitamax = 10;
    private static int m = 3;

    public Piscina(Semaphore piena, Semaphore mutex) {
        this.piena = piena;
        this.mutex = mutex;
    }
    

    private void entra() {
        try {
            mutex.acquire();
            while (numPersone >= capacitamax) {
                System.out.println(getName() + " aspetta, la piscina è piena.");
                mutex.release();
                piena.acquire();
                mutex.acquire();
            }

            if (numPersone >= m) {
                System.out.println(getName() + " aspetta, ci sono già " + numPersone + " persone nella piscina.");
                mutex.release();
                piena.acquire();
                mutex.acquire();
            }

            numPersone++;
            System.out.println(getName() + " è entrato in piscina. Persone in piscina: " + numPersone);
            mutex.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void esci() {
        try {
            mutex.acquire();
            numPersone--;
            System.out.println(getName() + " è uscito dalla piscina. Persone in piscina: " + numPersone);
            if (numPersone < capacitamax) {
                piena.release();
            }
            mutex.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            entra();
            Thread.sleep(2000);
            esci();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
