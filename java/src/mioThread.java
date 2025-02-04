public class mioThread extends Thread {
    private String nome;
    private int pausa;

    public mioThread(String nome, int pausa) {
        this.nome = nome;
        this.pausa = pausa;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(nome + " [" + (i + 1) + "]");
            try {
                Thread.sleep(pausa);
                Thread.yield();
            } catch (InterruptedException e) {
                System.out.println("il processo è in pausa");
                e.printStackTrace();
            }

            System.out.println(nome + " tempo corrente: " + System.currentTimeMillis());

        }

        System.out.println(nome + " terminato");
    }

    public static void main(String[] args) {
        mioThread pompilio = new mioThread("pompilio", 500);
        mioThread tama = new mioThread("tama", 1000);
        mioThread ghetta = new mioThread("ghetta", 2340);
        pompilio.start();
        tama.start();
        ghetta.start();
        try {
            System.out.println("\n\nattendo pompilio\n\n");
            pompilio.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("\n\nattendo tama\n\n");
            tama.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("\n\nattendo ghetta\n\n");
            ghetta.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}