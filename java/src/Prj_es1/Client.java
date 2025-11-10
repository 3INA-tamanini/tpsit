package Prj_es1;

import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {
        String HOST = "127.0.0.1"; //ip local local ip
        int PORT = 5000; //porta

        System.out.println("[CLIENT] Connessione a " + HOST + ":" + PORT + "...");

        try (
                 Socket socket = new Socket(HOST, PORT)/*Crea il socket e apre la connessione con il server*/;  BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))/*oggetto per leggere i messaggi del server*/;  PrintWriter out = new PrintWriter(socket.getOutputStream(), true) /*oggetto per inviare i dati al server*/;  BufferedReader kb = new BufferedReader(new InputStreamReader(System.in))/*Lettore da tastiera per inserimento dell'utente*/) {

            // Legge e stampa il messaggio di benvenuto;
            System.out.println("[SERVER] " + in.readLine());
            String line;

            boolean ciclo = true;

            //Ciclo per la comunicazione
            while (ciclo == true) {
                System.out.print(">");
                line = kb.readLine();   // Legge la riga da tastiera!

                out.println(line);   //Lui invia la riga al server*

                String response = in.readLine();    //riceve la risposta dal server

                System.out.println("[SERVER] " + response);     //restituisce la risposta dal server

                if (response.toLowerCase().contains("chiusa")) {    //se vede la parola chiusa interrompe=
                    ciclo = false;
                }
            }

            System.out.println("[CLIENT] Connessione terminata.");
        } catch (IOException e) {
            System.out.println("[CLIENT] Errore: " + e.getMessage());
        }
    }
}
