package battnav;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerClassNav {

    public static void main(String[] args) throws IOException {
        int porta = 5000;
        ServerSocket server = new ServerSocket(porta);
        System.out.println("Server in attesa sulla porta " + porta);

        Socket conn = server.accept();
        System.out.println("Client collegato!");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        PrintWriter out = new PrintWriter(conn.getOutputStream(), true);

        out.println("Benvenuto! Scrivi le 2 posizioni separate da uno spazio (1 1) ");
        Scanner inp = new Scanner(System.in);

        String messaggio;

        GrigliaNavi gioco = new GrigliaNavi();
        gioco.aggiungiNave(1, 1);
        gioco.aggiungiNave(2, 2);
        gioco.aggiungiNave(3, 3);
        gioco.aggiungiNave(4, 4);
        gioco.aggiungiNave(5, 5);
        int cont = 0;
        while ((messaggio = in.readLine()) != null) {
            System.out.println("Client ha detto: " + messaggio);
            String[] string = messaggio.split(" ");

            String risposta = gioco.segnaColpo(Integer.parseInt(string[0]), Integer.parseInt(string[1]));

            if (risposta.equalsIgnoreCase("colpito!")) {
                cont++;
            }

            if (cont == 5) {
                out.println("hai vinto gg");
                conn.close();
                server.close();
            }
            if (messaggio.equalsIgnoreCase("exit")) {
                out.println("Connessione terminata. Ciao!");
                break;
            }

            gioco.stampaGriglia();

            out.println(risposta);
            System.out.println("Server ha risposto: " + risposta);
        }

        conn.close();
        server.close();
        System.out.println("Server chiuso.");
    }
}
