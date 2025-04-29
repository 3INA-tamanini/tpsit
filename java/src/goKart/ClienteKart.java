package goKart;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ClienteKart extends Thread{
    Semaphore semaforoKart;
    String nome;

    public ClienteKart(String nome, Semaphore semaforoKart) {
        this.semaforoKart = semaforoKart;
        this.nome = nome;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            try {
                semaforoKart.acquire();
                System.out.println(nome + " sta usando il kart");
                Thread.sleep(r.nextInt(2000));
                semaforoKart.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
