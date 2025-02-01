public class StampaMessaggi extends Thread {

    @Override

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Esecuzione del Thread: " + getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StampaMessaggi s1 = new StampaMessaggi();

        s1.start();
    }
}
