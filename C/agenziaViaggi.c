/*
Un’agenzia Viaggi organizza escursioni per gruppi di persone. L’Agenzia concede una gratuità ogni 15
partecipanti. Il costo del viaggio è di 120€, se le persone sono più di 40 viene applicato un ulteriore
sconto del 10%.
Determinare:
? Il numero di gratuità
? Il costo totale del viaggio
? Il numero di pullman necessari, considerando che ciascuno dispone di 50 posti.
? Il numero di posti che rimangono vuoti
*/

#include <stdio.h>

int main(){
	int costo = 120;
	int persone, nGratuita, costoTot, nPullman, postiVuoti;
	
	printf("inserisci il numero di persone: ");
	scanf("%d", &persone);
	
	if(persone>40){
		costo = costo-((10*persone)/100);
	}
	nGratuita = persone/15;
	printf("il numero di gratuita' e': %d \n", nGratuita);
	
	costoTot =  costo*(persone-nGratuita);
	printf("il costo tot e: %d \n", costoTot);
	
	nPullman =  (persone/50)+1;
	printf("il numero di pullman e: %d \n", nPullman);
	
	postiVuoti = 50-(persone/nPullman);	
	printf("i posti vuoti sono: %d \n", postiVuoti);
	return 0;
}
