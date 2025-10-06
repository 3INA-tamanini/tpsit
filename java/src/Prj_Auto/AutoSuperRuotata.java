
package Prj_Auto;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class AutoSuperRuotata extends Thread {

    private String nome;
    private int peso;
    private int velocita;
    private int ruoteExtra;
    private int distanza_percorsa = 0;
    private final int distanza_tot = 1000;

    private static final Semaphore sP = new Semaphore(1); 
    private Podio p;
    private Random random = new Random();

    public AutoSuperRuotata(String nome, int peso, int velocita, int ruoteExtra, Podio p) {
        this.nome = nome;
        this.peso = peso;
        this.velocita = velocita;
        this.ruoteExtra = ruoteExtra;
        this.p=p;
    }

    @Override
    public void run() {
        while (distanza_percorsa < distanza_tot) {
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
            }

            if (p.incontraOstacolo(peso)) {
                Ostacolo();
            }

            distanza_percorsa += velocita;
            if (distanza_percorsa > distanza_tot) {
                distanza_percorsa = distanza_tot;
            }

            System.out.println(nome + " e' arrivata a " + distanza_percorsa + " metri dal traguardo");
        }

        try {
            sP.acquire();
            p.arrivi(nome);
            sP.release();
        } catch (InterruptedException e) {
        }
    }


    private void Ostacolo() {
        boolean pedana = random.nextBoolean();

        if (pedana) {
            velocita *= 0.95;
            if (velocita < 1) {
                velocita = 1;
            }
            System.out.println(nome + " ha rallentato sulla pedana");
        } else {
            if (ruoteExtra > 2) {
                System.out.println(nome + " ha superato il dosso senza problemi");
            } else {
                velocita *= 0.97;
                if (velocita < 1) {
                    velocita = 1;
                }
                System.out.println(nome + " ha rallentato sul dosso");
            }
        }
    }
}
