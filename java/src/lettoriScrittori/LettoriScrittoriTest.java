package lettoriScrittori;


public class LettoriScrittoriTest {


public static void main(String[] args) {


     int numThreads = 4;


     for (int i = 0; i < numThreads; i++) {

         LettoriScrittori b = new LettoriScrittori();

         b.setName("lettoriScrittori-" + i);

         b.start();

     }

}

}