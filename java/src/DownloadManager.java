public class DownloadManager {
    public static void main(String[] args) {
    String[] files = {"file1.zip", "file2.mp4", "file3.pdf", "file4.jpg"};
    for (String file : files) {
    new Thread(new FileDownloader(file)).start();
    }
    }
    }