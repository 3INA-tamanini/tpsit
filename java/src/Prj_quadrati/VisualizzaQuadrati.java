public class VisualizzaQuadrati {
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) { //ciclo for per calcolare il quadrato dei numeri da 10 a 20
            CalcolaQuadrato thread = new CalcolaQuadrato(i); //istanziare il costruttore
            thread.start();//avviare il thread
        }
    }
}