package Prj_socket2;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    public static void main(String[] args) {
        try {
            String host = "127.0.0.1"; // localhost oppure IP
            int porta = 5000;
            System.out.println("Tentativo di connessione al server...");
            Socket connessione = new Socket(host, porta);
            System.out.println("Connesso al server!");
            BufferedReader in = new BufferedReader(new InputStreamReader(connessione.getInputStream()));
            PrintWriter out = new PrintWriter(connessione.getOutputStream(), true);
            String messaggio = in.readLine();
            System.out.println("Server dice: " + messaggio);
            
            out.println("ciao");
            System.out.println("Client ha inviato: ciao");
            connessione.close();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
