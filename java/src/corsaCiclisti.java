public class corsaCiclisti extends Thread {

    int distanza;

    public corsaCiclisti(int distanza){
        this.distanza = distanza;
    }

    @Override
    public void run() {
        int place = 0;
        while (place < distanza) {
            System.out.println(getName() + " ha percorso " + place + "m" + " su " + distanza + "m");
            place = place + 10;
        }

        System.out.println(getName() + " è arrivato");

    }

}
