package Prj_es1Bernardi;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MainServer {

    public static void main(String[] args) throws IOException {
        int porta = 5000;
        ServerSocket server = new ServerSocket(porta);
        System.out.println("Server in attesa sulla porta " + porta);

        Socket conn = server.accept();
        System.out.println("Client collegato!");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        PrintWriter out = new PrintWriter(conn.getOutputStream(), true);

        out.println("Benvenuto! Scrivi qualcosa e ti risponderò (digita 'exit' per uscire)");
        Scanner inp = new Scanner(System.in);
        String messaggio;
        while ((messaggio = in.readLine()) != null) {
            System.out.println("Client ha detto: " + messaggio);

            if (messaggio.equalsIgnoreCase("exit")) {
                out.println("Connessione terminata. Ciao!");
                break;
            }
            System.out.print(">");
            
            String risposta = inp.nextLine();
            out.println(risposta);
            System.out.println("Server ha risposto: " + risposta);
        }

        conn.close();
        server.close();
        System.out.println("Server chiuso.");
    }
}
