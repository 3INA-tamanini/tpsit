#include <stdio.h>
#include <string.h>
struct Libro{
		char titolo[100];
		char autore[50];
		int annoPublicazione;
	};
	int main(){
	
	struct Libro libro;
	
	printf("inserisci il titolo del libro(max 100 caratteri): ");
	scanf("%s", &libro.titolo);
	
	printf("inserisci il nome del bro (max 50 caratteri): ");
	scanf("%s", &libro.autore);
	
	printf("inserisci l'anno di publicazione:");
	scanf("%d", &libro.annoPublicazione);
	
	
	printf("titolo: %s\n", libro.titolo);
	printf("autore: %s\n", libro.autore);
	printf("anno publicazione: %d", libro.annoPublicazione);
	return 0;
}

