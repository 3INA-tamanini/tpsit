import java.util.Random;

public class CorsaBimbi extends Thread {
    private String nome;
    private int posizione = 0;
    private static int posto;

    public CorsaBimbi(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        Random r = new Random();
        System.out.println(nome + " è partito");

        while (posizione < 100 && posto < 1) {
            posizione += r.nextInt(10) + 1;

            if (posizione > 100) {
                System.out.println("\n\n" + nome + " ha preso la merenda\n\n");
                posto++;
            } else {
                System.out.println(nome + " ha fatto " + posizione + "m");
                try {
                    System.out.println(nome + " si riposa un attimo");
                    Thread.sleep(r.nextInt(500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        CorsaBimbi carlo = new CorsaBimbi("Carlo");
        CorsaBimbi matilde = new CorsaBimbi("matilde");
        CorsaBimbi francesco = new CorsaBimbi("francesco");
        try {
            carlo.start();
            matilde.start();
            francesco.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
