/*Si scriva un programma che chieda una stringa all’utente e conti quanti siano i
caratteri che la costituiscono, NON si usi la funzione strlen della libreria
standard.*/

#include <stdio.h>

int main(){
	char str[100];
	int cont = 0;
	
	printf("inserisci una stringa: ");
	scanf("%s", &str);
	int i = 0;
	while(str[i]!=NULL){
		i++;
	}
	printf("la stringa ha %d caratteri", i);
	
	return 0;
}
