#include <stdio.h>
#include <stdlib.h>

struct data
{
    int matricola;
    char nome[50];
    char cognome[50];
    int voti[5];
} Studente;

int main()
{

    printf("Inserire la matricola: ");
    scanf("%d", &Studente.matricola);
    printf("Inserire il nome e il cognome: ");
    scanf("%s %s", Studente.nome, Studente.cognome);

    for (int i = 0; i < 5; i++)
    {
        printf("Inserire il %d voto: ", i + 1);
        scanf("%d", &Studente.voti[i]);
    }

    printf("\nMatricola: %d\n", Studente.matricola);
    printf("Studente: %s %s\n", Studente.nome, Studente.cognome);
    printf("voti:");
    float media;
    for (int i = 0; i < 5; i++)
    {
        media+=Studente.voti[i];
        printf(" %d", Studente.voti[i]);
    }
    media = media/5;
    printf("\nMedia dei voti: %.1f", media);

    return 0;
}
