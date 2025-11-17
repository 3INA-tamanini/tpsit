package battnav;

import java.io.*;
import java.net.*;

public class ClientBattNav {

    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int porta = 5000;

        System.out.println("Tentativo di connessione al server...");
        Socket connessione = new Socket(host, porta);
        System.out.println("Connesso al server!");

        BufferedReader in = new BufferedReader(new InputStreamReader(connessione.getInputStream()));
        PrintWriter out = new PrintWriter(connessione.getOutputStream(), true);
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Server dice: " + in.readLine());

        String input;

        while (true) {
            System.out.print("> ");
            input = kb.readLine();
            out.println(input);

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String risposta = in.readLine();

            System.out.println("Server: " + risposta);
            if (risposta.equalsIgnoreCase("hai vinto gg")) {
                break;
            }
        
        }

        connessione.close();
        kb.close();
        System.out.println("Connessione chiusa.");
    }
}
