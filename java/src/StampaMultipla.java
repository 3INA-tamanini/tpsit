public class StampaMultipla extends Thread{
    private String nome;
    private int numero;


    public StampaMultipla(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < numero; i++) {
                System.out.println(nome);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StampaMultipla s1 = new StampaMultipla("pompilio", 5);

        s1.start();
    }
}
