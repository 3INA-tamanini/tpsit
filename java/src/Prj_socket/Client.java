package Prj_socket;

import java.io.*; // Importa le classi per l'I/O (InputStreamReader, BufferedReader, PrintWriter)
import java.net.*; // Importa le classi per la comunicazione TCP/IP (Socket)

public class Client {

    public static void main(String[] args) {
        String HOST = "127.0.0.1"; // Indirizzo del server: localhost
        int PORT = 5000;
// Porta su cui è in ascolto il server
        System.out.println("[CLIENT] Connessione a " + HOST + ":" + PORT + "...");
// Try-with-resources: tutte le risorse verranno chiuse automaticamente alla fine
        try (
            // Crea il socket e apre la connessione con il server
            Socket socket = new Socket(HOST, PORT); // Lettore per ricevere dati dal server (testo riga per riga)
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Scrittore per inviare dati al server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // Lettore da tastiera per inserimento dell'utente
            BufferedReader kb = new BufferedReader(new InputStreamReader(System.in)) // Legge e stampa il messaggio di benvenuto inviato dal server
            ) {

            System.out.println("[SERVER] " + in.readLine());
            String line; // Buffer per memorizzare l'input utente
            while (true) { // Ciclo principale di comunicazione
                System.out.print(">"); // Prompt per l'utente
                line = kb.readLine();
// Legge una riga da tastiera
                if (line == null) {
                    break; // Esce se l'utente termina (EOF)
                }// Invia la riga scritta dall'utente al server
                out.println(line);
//Attende la risposta del server (una riga)
                String response = in.readLine();
                if (response == null) {
                    break; // Se il server ha chiuso la connessione, esce
                }//Mostra la risposta ricevuta dal server 
                System.out.println("[SERVER] " + response);
//Se la risposta contiene "chiusa", il server sta terminando la sessione
                if (response.toLowerCase().contains("chiusa")) {
                    break;
                }
            }
// Messaggio finale di chiusura lato client
            System.out.println("[CLIENT] Connessione terminata.");
        } catch (IOException e) { // Gestione degli errori di rete
            System.out.println("[CLIENT] Errore: " + e.getMessage());
        }
    }
}