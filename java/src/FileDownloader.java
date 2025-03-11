public class FileDownloader implements Runnable {
    private final String fileName;

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Inizio download: " + fileName);
        for (int i = 1; i <= 100; i += 20) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Download interrotto: " + fileName);
                return;
            }
            System.out.println("Download " + fileName + ": " + i + "% completato");
        }
        System.out.println("Download completato: " + fileName);
    }
}
