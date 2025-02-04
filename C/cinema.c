/*
Un cinema applica una tariffa insolita: 5 euro per coloro che sono alti fino 1,5m. e maggiora il
biglietto di 10 centesimi per ogni centimetro che eccede la soglia della statura di un metro e
cinquanta. Detta “a” l’altezza data in cm., descrivere la procedura risolutiva da applicare (algoritmo)
e successivamente disegnare il relativo flow chart. (Suggerimento: indica con “a” l’altezza, cioè la
variabile di ingresso e con “prezzo” la variabile di uscita, cioè il costo del biglietto). 3 amici, Aldo,
Giovanni e Giacomo sono alti, rispettivamente: 148cm, 168 cm, 180 cm. Quanto paga ciascuno di essi?
*/
#include <stdio.h>
int main(){
    int a;
    int p;
    double prezzo,prezzotot;
    prezzo = 5;

    int i = 0;
    printf("Inserire il numero di persone: ");
    scanf("%d", &p);
    
    while(i<p){
    	printf("Inserire l'altezza (in cm): ");
    	scanf("%d", &a);
    	
    	if(a<=150){
    		prezzotot += prezzo;	
		}else{
			
			prezzotot += ((a - 150) * 0.10) + prezzo;
		}
		i++;
	}
    printf("Il costo totale e' %.2f", prezzotot);

    return 0;
}
