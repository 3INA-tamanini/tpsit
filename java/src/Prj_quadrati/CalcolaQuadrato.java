public class CalcolaQuadrato extends Thread {
    private final int numero; //numero di cui calcolare il quadrato

    public CalcolaQuadrato(int numero) {
        this.numero = numero;
        //costruttore
    }

    @Override
    public void run() {
        //calcola il quadrato del numero
        int quadrato = numero * numero;
        //stampa il risultato
        System.out.println(getName() + " - Quadrato di " + numero + " è: " + quadrato);
    }
}
