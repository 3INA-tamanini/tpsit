
package Prj_Auto;

import java.util.Random;

public class Podio {

    private Random random = new Random();
    private int arrivo;

    public void arrivi(String nome) {
        System.out.println(nome + " e' arrivato " + arrivo + "*");
        arrivo++;
    }

    public boolean incontraOstacolo(int peso) {
        int probabilita;

        probabilita = random.nextInt(100) + 1;

        if (peso > 50 && probabilita < 41) {
            return true;
        } else if (peso <= 50 && probabilita < 21) {
            return true;
        } else {
            return false;
        }

    }

}