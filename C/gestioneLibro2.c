/*
Esercizio 1: Gestione di un Libro
Crea una struttura per memorizzare le informazioni su un Libro. La struttura deve contenere:
Il titolo del Libro (un array di caratteri di massimo 50 elementi),
Il nome dell'autore (un array di caratteri di massimo 50 elementi),
Il numero di pagine (intero).
Scrivi un programma che:
Allochi dinamicamente la memoria per un Libro
Chieda all'utente di inserire i dettagli del Libro,
Stampi i dettagli del Libro usando un puntatore e l'operatore freccia,
Dealloca la memoria una volta terminato.*/

#include <stdio.h>
#include <stdlib.h>
typedef struct
{
    char titolo[50];
    char autore[50];
    int nPagine;
} Libro;

int main()
{

    Libro *libro = (Libro*) malloc(sizeof(Libro) * 5);

    printf("inserisci il titolo: ");
    scanf("%s", &libro->titolo);
    printf("inserisci l'autore: ");
    scanf("%s", &libro->autore);
    printf("inserisci il numero di pagine: ");
    scanf("%d", &libro->nPagine);

    printf("titolo: %s \nautore : % s \nnumero pagine : % d ", libro->titolo, libro->autore, libro->nPagine);

    free(libro);
}
