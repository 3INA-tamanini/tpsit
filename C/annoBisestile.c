#include <stdio.h>
/*Nel mese di febbraio ogni 4 anni viene aggiunto un giorno per evitare lo slittamento delle stagioni.
Quindi ogni 4 anni avremo 366 giorni anzich� 365.
Per vedere se un anno � bisestile dobbiamo dividerlo per 400; 
se � divisibile allora � sicuramente un anno bisestile; 
altrimenti saranno bisestili solo quegli anni che si possono dividere per 4 ma non per 100.
Esempi di anni bisestili sono:
1600, 1604, 1608 fino al 1696. Il 1700 non � bisestile. 
E ancora il 1704, 1708 fino a 1796. Il 1800 non � bisestile.
Allo stesso modo neanche il 1900 � bisestile e cos� via.
In definitiva per apportare un�ulteriore approssimazione si � stabilito di non rendere bisestili gli anni secolari, 
eccetto quelli divisibili per 400.
Predisporre il diagramma di flusso e il codice in linguaggio C*/


int main(){
	int a;
	printf("inserisci l'anno: ");
	scanf("%d", &a);
	
	if(a%400==0 || (a%4==0&&a%100!=0)){
		printf("l'anno e' bisestile");
	}else{
		printf("l'anno non e' bisestile");
	}
}
