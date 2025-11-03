package Prj_socket; // Package (facoltativo) per organizzare il codice 

import java.io.*; // Import delle classi di input/output 

import java.net.*; // Import delle classi di rete (ServerSocket, Socket) 

public class MainServer {

    public static void main(String[] args) {

        int PORT = 5000;

        System.out.println("[SERVER] Avvio su porta " + PORT + "...");

        try ( ServerSocket server = new ServerSocket(PORT)) {

            System.out.println("[SERVER] In attesa di un client...");

            try ( Socket socket = server.accept();  BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));  PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                System.out.println("[SERVRER] Connessione stabilità con " + socket.getInetAddress());

                out.println("Benvenuto nel server ECHO! Digita 'exit' per terminare.");

                String line;

                int i = 0;

                while ((line = in.readLine()) != null && i == 0) {

                    if ("exit".equalsIgnoreCase(line.trim())) {

                        out.println("Connessione chiusa. Ciao!");

                        i++;

                        socket.close();

                    }

                    System.out.println("[SERVER] Ricevuto: " + line);

                    out.println("ECHO: " + line.toUpperCase());

                }

                System.out.println("[SERVER] Client disconnesso.");

            } catch (IOException e) {

                System.out.println("[SERVER] Errore nella comunicazione: " + e.getMessage());

            }

        } catch (IOException e) {

            System.out.println("[SERVER] Errore di avvio: " + e.getMessage());

        }

    }

}
