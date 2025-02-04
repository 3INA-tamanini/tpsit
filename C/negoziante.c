#include <stdio.h>
// Un negoziante vuole calcolare quanto guadagna in una settimana sapendo quanto guadagna nei sette giorni;
int main(){
	
	float lun,mar,mer,gio,ven,sab,dom,tot;
	printf("inserisci il guadagno di lunedi: ");
	scanf("%f", &lun);
	printf("inserisci il guadagno di martedi: ");
	scanf("%f", &mar);
	printf("inserisci il guadagno di mercoledi: ");
	scanf("%f", &mer);
	printf("inserisci il guadagno di giovedi: ");
	scanf("%f", &gio);
	printf("inserisci il guadagno di venerdi: ");
	scanf("%f", &ven);
	printf("inserisci il guadagno di sabato: ");
	scanf("%f", &sab);
	printf("inserisci il guadagno di domenica: ");
	scanf("%f", &dom);
	
	tot = lun+mar+mer+gio+ven+sab+dom;
	printf("il totale e': %f ", tot);
	
	return 0;
}
