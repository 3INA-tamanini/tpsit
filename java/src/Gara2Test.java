public class Gara2Test {
    public static void main(String[] args) {
        Gara2 a = new Gara2("A", 100);
        Gara2 b = new Gara2("B", 50);
        Gara2 c = new Gara2("C", 10);

        try {
            a.start();
            b.start();
            c.start();
            
            a.join();
            b.join();
            c.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
