#include <stdio.h>
#include <stdlib.h>

int main(){
	
	struct data
	{
		char titolo[100];
		char autore[50];
		int annoPubblicazione;
	}Libro;
	
	printf("Inserire il titolo del libro: ");
	scanf("%s", Libro.titolo);
	printf("Inserire il nome dell'autore: ");
	scanf("%s", Libro.autore);
	printf("Inserire l'anno di pubblicazione: ");
	scanf("%d", &Libro.annoPubblicazione);
	
	printf("\nTitolo: %s", Libro.titolo);
	printf("\nAutore: %s", Libro.autore);
	printf("\nAnno di pubblicazione: %d", Libro.annoPubblicazione);
	
	return 0;
}
