// funzione sizeof
// la funzione restituisce l'occupazione di memoria in byte di una variabile
// può essere applicata anche ad un tipo
// tutti i puntatori contengono indirizzi e di conseguenza occupano lo spazio di un indirizzo
#include <stdio.h>
#include <stdlib.h>

int main()
{

	char *pc;
	int *pi;
	double *pd;
	printf("%d %d %d\n", sizeof(pc), sizeof(pi), sizeof(pd));
	printf("%d %d %d\n", sizeof(char *), sizeof(int *), sizeof(double *));
	printf("%d %d %d\n", sizeof(*pc), sizeof(*pi), sizeof(*pd));
	printf("%d %d %d\n", sizeof(char), sizeof(int), sizeof(double));
	return 0;
}