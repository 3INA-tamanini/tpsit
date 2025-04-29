package goKart;

import java.util.concurrent.Semaphore;

public class GoKart {
    public static void main(String[] args) {
        Semaphore semaforoKart = new Semaphore(5);
        ClienteKart c1 = new ClienteKart("1", semaforoKart);
        ClienteKart c2 = new ClienteKart("2", semaforoKart);
        ClienteKart c3 = new ClienteKart("3", semaforoKart);
        ClienteKart c4 = new ClienteKart("4", semaforoKart);
        ClienteKart c5 = new ClienteKart("5", semaforoKart);
        ClienteKart c6 = new ClienteKart("6", semaforoKart);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
    }
}
