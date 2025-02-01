#include <stdio.h>
#include <string.h>

int main()
{
    struct Libro
    {
        char titolo[100];
        char autore[50];
        int annoPublicazione;
    };

    struct Libro libro;

    printf("inserisci il titolo del libro(max 100 caratteri): ");
    gets(libro.titolo);
    printf("inserisci il nome dell'autore (max 50 caratteri): ");
    gets(libro.autore);
    printf("inserisci l'anno di publicazione:");
    scanf("%d", &libro.annoPublicazione);

    printf("titolo: %s\n", libro.titolo);
    printf("autore: %s\n", libro.autore);
    printf("anno publicazione: %d", libro.annoPublicazione);
    return 0;
}