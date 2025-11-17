package battnav;

import java.util.Scanner;  // Import per leggere input da tastiera

public class GrigliaNavi {

    private char[][] griglia;    // Matrice per la griglia di gioco
    private Scanner input;       // Scanner per input da console

    // Costruttore: crea griglia 10x10 e la inizializza ad acqua ('~')
    public GrigliaNavi() {
        griglia = new char[10][10];  // Crea matrice 10x10
        input = new Scanner(System.in);  // Crea scanner per input
        for (int i = 0; i < 10; i++) {   // Ciclo righe
            for (int j = 0; j < 10; j++) {  // Ciclo colonne
                griglia[i][j] = '~';   // Imposta acqua come valore iniziale
            }
        }
    }

    // Aggiunge una nave in posizione (riga, colonna) se valida e libera
    public void aggiungiNave(int riga, int colonna) {
        if (validaPosizione(riga, colonna)) {  // Controlla coordinate valide
            if (griglia[riga][colonna] == '~') {  // Verifica che non ci sia già nave
                griglia[riga][colonna] = 'N';  // Posiziona nave
                System.out.println("Nave aggiunta in posizione (" + riga + "," + colonna + ")");
            } else {  // Posizione occupata
                System.out.println("Posizione già occupata!");
            }
        } else {  // Coordinate non valide
            System.out.println("Posizione non valida!");
        }
    }

    // Segna un colpo in posizione (riga, colonna)
    public String segnaColpo(int riga, int colonna) {
        String testo = "";
        if (validaPosizione(riga, colonna)) {  // Verifica validità posizione
            if (griglia[riga][colonna] == 'N') {  // Se c'è nave
                griglia[riga][colonna] = 'X';   // Segna colpo riuscito
                testo = "Colpito!";
            } else if (griglia[riga][colonna] == '~') { // Se acqua, colpo mancato
                griglia[riga][colonna] = 'o';  // Segna colpo mancato
                testo = "Mancato!";
            } else {  // Posizione già colpita precedentemente
                testo = "posizione già colpita";
            }
        } else {  // Coordinate fuori range
            testo = "posizione non valida";
        }

        return testo;
    }

    // Controlla se coordinate sono entro dimensioni griglia
    private boolean validaPosizione(int riga, int colonna) {
        return riga >= 0 && riga < 10 && colonna >= 0 && colonna < 10;
    }

    // Stampa la griglia in console con righe e colonne numerate
    public void stampaGriglia() {
        System.out.print("  ");  // Spazio iniziale per numeri colonne
        for (int c = 0; c < 10; c++) {
            System.out.print(c + " ");  // Stampa numeri colonne
        }
        System.out.println();  // A capo

        for (int r = 0; r < 10; r++) {  // Per ogni riga
            System.out.print(r + " ");  // Stampa numero riga
            for (int c = 0; c < 10; c++) {
                System.out.print(griglia[r][c] + " ");  // Stampa valore cella
            }
            System.out.println();  // A capo dopo riga
        }
    }

    // Menu per inserire fino a 5 navi tramite input da tastiera
    public void menuInserimentoNavi() {
        System.out.println("Inserisci le posizioni delle navi (massimo 5 navi). Usa coordinate da 0 a 9.");
        int navi = 0;
        while (navi < 5) {  // Continua finché non si posizionano 5 navi
            System.out.print("Riga nave #" + (navi + 1) + ": ");
            int r = input.nextInt();  // Legge riga da input
            System.out.print("Colonna nave #" + (navi + 1) + ": ");
            int c = input.nextInt();  // Legge colonna da input

            if (validaPosizione(r, c) && griglia[r][c] == '~') {  // Posizione valida e libera
                aggiungiNave(r, c);  // Posiziona nave
                navi++;  // Conta nave posizionata
            } else {
                System.out.println("Posizione non valida o già occupata, riprova.");
            }
        }
    }

    // Menu per effettuare colpi finché l'utente inserisce coordinate valide o -1 per uscire
    public void menuColpi() {
        System.out.println("Inserisci le coordinate per sparare (es. 0 0). Digita -1 -1 per uscire.");
        while (true) {
            System.out.print("Riga colpo: ");
            int r = input.nextInt();  // Legge riga
            System.out.print("Colonna colpo: ");
            int c = input.nextInt();  // Legge colonna

            if (r == -1 && c == -1) {  // Se utente vuole uscire
                System.out.println("Uscita dal menu colpi.");
                break;
            }

            if (validaPosizione(r, c)) {  // Se coordinate valide
                segnaColpo(r, c);  // Segna colpo
                stampaGriglia();   // Mostra griglia aggiornata
            } else {
                System.out.println("Coordinate non valide, riprova.");
            }
        }
    }

    // Metodo principale di esecuzione
    public static void main(String[] args) {
        GrigliaNavi gioco = new GrigliaNavi();  // Crea istanza gioco

        System.out.println("***** Inserimento Navi *****");
        gioco.menuInserimentoNavi();  // Menu per posizionare navi

        System.out.println("\n***** Inizio partita - pesca colpi *****");
        gioco.menuColpi();  // Menu per inserire colpi da console

        System.out.println("Fine partita. Grazie per aver giocato!");
    }
}
