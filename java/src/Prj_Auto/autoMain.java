
package Prj_Auto;

public class autoMain {
    public static void main(String[] args) {
        Podio podio = new Podio();

        AutoPlanante auto1 = new AutoPlanante("Berrari", 45, 100, 100, podio);
        AutoPlanante auto2 = new AutoPlanante("Lalaren", 60, 90, 80, podio);
        AutoSuperRuotata auto3 = new AutoSuperRuotata("TedBull", 100, 0, 3, podio);
        AutoSuperRuotata auto4 = new AutoSuperRuotata("BMW", 300, 0, 1, podio);

        auto1.start();
        auto2.start();
        auto3.start();
        auto4.start();

        try {
            auto1.join();
            auto2.join();
            auto3.join();
            auto4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}