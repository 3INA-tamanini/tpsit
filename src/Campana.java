public class Campana extends Thread {
    private String nomeCampana;
    private int intervallo;

    public Campana(String nomeCampana, int intervallo){
        this.nomeCampana=nomeCampana;
        this.intervallo=intervallo;
    }


    @Override
    public void run(){
        try {
            while(true){
                System.out.println(nomeCampana);
                Thread.sleep(intervallo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Campana c1 = new Campana("din", 1000);
        Campana c2 = new Campana("ghetta", 1000);
        Campana c3 = new Campana("dan", 1000);
        Campana c4 = new Campana("tomatoma", 1000);
        c1.start();
        c2.start();
        c3.start();
        c4.start();

        try {
            c1.join();
            c2.join();
            c3.join();
            c4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
