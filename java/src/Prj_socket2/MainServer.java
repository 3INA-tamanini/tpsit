package Prj_socket2;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainServer{
    public static void main(String[] args) {
        try {
            int porta = 5000; // es. 5000
            ServerSocket server = new ServerSocket(porta);
            System.out.println("Server in attesa sulla porta " + porta);
            Socket conn = server.accept();
            System.out.println("Client collegato!");
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            PrintWriter out = new PrintWriter(conn.getOutputStream(), true);
            out.println("ciao");
            System.out.println("Server ha inviato: ciao");
            String risposta = in.readLine();
            System.out.println("Client ha risposto: " + risposta);
            conn.close();
            server.close();
        } catch (IOException ex) {
            Logger.getLogger(MainServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}