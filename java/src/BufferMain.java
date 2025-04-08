
public class BufferMain {

    static class Produttore extends Thread {
        private final Buffer buffer;

        public Produttore(Buffer buffer) {
            this.buffer = buffer;
        }

        public void run() {
            try {
                for (int i = 1; i <= 10; i++) {
                    // Chiamare il metodo produci()
                    buffer.produci(i);
                    // Simulare un po’ di attesa
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                // Gestione semplificata
                e.printStackTrace();
            }
        }
    }

    static class Consumatore extends Thread {
        private final Buffer buffer;

        public Consumatore(Buffer buffer) {
            this.buffer = buffer;
        }

        public void run() {
            try {
                for (int i = 1; i <= 10; i++) {
                    // Chiamare il metodo consuma()
                    buffer.consuma();
                    Thread.sleep(150);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Metodo main: avvia i thread
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        // Avviare produttore e consumatore
        Produttore p = new Produttore(buffer);
        Consumatore c = new Consumatore(buffer);

        p.start();
        c.start();
    }
}