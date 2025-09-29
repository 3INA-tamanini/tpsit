package Prj_semaforo;

public class RisorsaMain { //classe main
    public static void main(String[] args) { //metodo main
        for (int i = 0; i < 10; i++) { //ciclo for per istanziare 10 thread
            ThreadUtente t = new ThreadUtente(i); //istanziare il thread
            t.start(); //avvia il thread
        }
    }
}
 