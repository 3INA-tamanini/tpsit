package Prj_Gara;

import java.util.Random;

public class Auto extends Thread {

    private String nome;
    private Float peso, velocita, dimAlettone;
    private int nRuotepiu, distanza = 1000;
    private String tipo;

    public Auto(String nome, Float peso, Float velocita, Float dimAlettone, int nRuote, String tipo) {
        this.nome = nome;
        this.peso = peso;
        this.velocita = velocita;
        this.dimAlettone = dimAlettone;
        this.nRuotepiu = nRuote;
        this.tipo = tipo.toLowerCase();
    }

    @Override
    public void run() {
        Random r = new Random();
        while (distanza > 0) {

            if (velocita < 1) {
                velocita = 1f;
            }
            
            int cisco = r.nextInt(5);
            
            if (peso <= 50) {
                
                
                //fossa
                if (cisco == 1) {
                    if (tipo.equals("superruotata")) {
                        if (nRuotepiu < 2) {
                            velocita *= 0.97f;
                        }
                    } else {
                        velocita *= 0.95f;
                    }

                }

                //pedana
                if (cisco == 2) {
                    if (tipo.equals("autoplanante")) {
                        if (dimAlettone > 90) {

                            velocita *= 1.02f;
                        }
                    } else {
                        velocita *= 0.95f;
                    }

                }
            }else{
                
                //fossa
                if (cisco == 1 || cisco==3) {
                    if (tipo.equals("superruotata")) {
                        if (nRuotepiu < 2) {
                            velocita *= 0.97f;
                        }
                    } else {
                        velocita *= 0.95f;
                    }

                }

                //pedana
                if (cisco == 2 || cisco == 4) {
                    if (tipo.equals("autoplanante")) {
                        if (dimAlettone > 90) {

                            velocita *= 1.02f;
                        }
                    } else {
                        velocita *= 0.95f;
                    }

                }
            }

            distanza -= velocita;
        }
        //accede alla risorsa
        
        
        System.out.println("hA vinTo");

    }
    
    /* CLASSE PODIO
        Queue<Auto> codaPodio = new LinkedList<>();
        tutti i metodi vanno sincronizzati
        aggiungi autoPodio
        codaPodio.add(auto)
        
        mostraPodio
        uso del for per stampare la codaPodio
        */
}
