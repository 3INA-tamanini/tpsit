public class CampaneAsincrone extends Thread{
    private String suono;

    public CampaneAsincrone(String suono) {
        this.suono = suono;
    }

    @Override
    public void run(){
        System.out.println(suono);
    }

    public static void main(String[] args) {
        CampaneAsincrone c1 = new CampaneAsincrone("DIN");
        CampaneAsincrone c2 = new CampaneAsincrone("DON");
        CampaneAsincrone c3 = new CampaneAsincrone("DAN");

        try {
            c1.start();
            c2.start();
            c3.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
