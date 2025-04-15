package biblioteca;


public class BibliotecaTest {


public static void main(String[] args) {


     int numThreads = 4;


     for (int i = 0; i < numThreads; i++) {

         Biblioteca b = new Biblioteca();

         b.setName("Bibliotecari-" + i);

         b.start();

     }

}

}