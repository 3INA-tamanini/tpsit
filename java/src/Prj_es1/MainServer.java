package Prj_es1;

import java.io.*;
import java.net.*;

public class MainServer {

    public static void main(String[] args) {
        int PORT = 5000; //porta

        System.out.println("[SERVER] Avvio su porta " + PORT + "...");
        try ( ServerSocket server = new ServerSocket(PORT)) {  //crea un socket nella porta specificata 
            System.out.println("[SERVER] In attesa di un client...");
            
            try ( Socket socket = server.accept();/*restituisce un socket per la comunicazione*/  BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));/*prende in input quello che scrive il client*/  PrintWriter out = new PrintWriter(socket.getOutputStream(), true )/*oggetto per inviare al client il messaggio*/) {
                
                System.out.println("[SERVER] Connessione stabilità con " + socket.getInetAddress()); //si connette

                out.println("Benvenuto nel server ECHO! Digita 'exit' per terminare."); //saluta il client

                String line;

                int i = 0;
                while ((line = in.readLine()) != null && i == 0) { //while finche non scrivi exit
                    if ("exit".equalsIgnoreCase(line.trim())) {
                        out.println("Connessione chiusa. Ciao!");
                        i++;

                        socket.close();
                    }

                    System.out.println("[SERVER] Ricevuto: " + line);

                    switch (line.toLowerCase()) { //switch per gestire le risposte
                        case "ciao":
                            out.println("Ciao socio");
                            break;
                        case "come va?":
                            out.println("Tuto bene");
                            break;
                        case "hai fame?":
                            out.println("No");
                            break;
                        case "":
                            out.println("Non sai cosa scrivere?");
                            break;
                        case "cisco":
                        case "cpt":
                            out.println("Cisco Packet Tracer (CPT)");
                            break;
                        case "nitriti":
                            out.println("Goldshin");
                            break;
                        case "snake":
                            out.println("my snake is solid");
                            break;
                        case "where is the pen?":
                            out.println("The pen is on the table");
                            break;
                        case "sei un evasore fiscale?":
                        case "evadi le tasse?":
                            out.println("Si.");
                            break;
                        case "ishbtotfydswl":
                            out.println("I Should Have Been The One To Fill Your Dark Soul With Light!");
                            break;
                        case "cp":
                        case "pt":
                        case "ct":
                            out.println("Forse intendevi CPT? (Cisco Packet Tracer)");
                            break;
                        case "cronos":
                            out.println("Lui manipola il tempo");
                            break;
                        case "gv":
                            out.println("Sei così infantile che non ti meriti nemmeno le caramelle");
                            break;
                        case "socket":
                            out.println("COMUNICATION!!!!!");
                            break;
                        case "hello":
                            out.println(" Mondo!");
                            break;
                        case "break":
                            out.println("Breakfast");
                            break;
                        case "peak":
                            out.println("Dark Souls II Scholar of the First Sin");
                            break;
                        case "tqq":
                            out.println("Miku, Nino, Yotsuba, Itsuki, Ichika");
                            break;
                        case "albero":
                            out.println("Granbosco, la foresta maledetta");
                            break;
                        default:
                            out.println("Questo messaggio non ha una risposta");
                    }
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
