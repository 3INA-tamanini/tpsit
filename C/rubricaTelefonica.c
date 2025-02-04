/*Descrizione: Crea una rubrica telefonica che utilizzi una lista collegata per memorizzare i contatti. Ogni contatto deve avere un nome, un cognome e un numero di telefono.
Funzionalità richieste:
Implementa le seguenti funzionalità:
Aggiungi un contatto alla rubrica.
Cerca un contatto per nome o cognome.
Rimuovi un contatto dalla rubrica.
Visualizza tutti i contatti presenti nella rubrica.
Usa una lista collegata per memorizzare i contatti.*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

typedef struct rubrica
{
    char nome[100];
    char cognome[100];
    char telefono[10];
    struct nodo *next;
} nodo;

nodo *inserimentoPrimoElem()
{
    nodo *temp = (nodo *)malloc(sizeof(nodo));

    printf("inserisci il nome: ");
    scanf("%s", temp->nome);
    printf("inserisci il cognome: ");
    scanf("%s", temp->cognome);
    printf("inserisci il numero di telefono: ");
    scanf("%s", temp->telefono);
    temp->next = NULL;
    return temp;
}

nodo *inserimentoPoi(nodo *coda)
{
    nodo *temp = (nodo *)malloc(sizeof(nodo));

    printf("inserisci il nome: ");
    scanf("%s", temp->nome);
    printf("inserisci il cognome: ");
    scanf("%s", temp->cognome);
    printf("inserisci il numero di telefono: ");
    scanf("%s", temp->telefono);
    temp->next = NULL; // imposta il puntatore al prossimo elemento a NULL
    coda->next = temp; // collega il nuovo nodo alla fine della lista
    return temp;
}

void stampa(nodo *testa)
{
    printf("nome    cognome     telefono\n");
    while (testa != NULL)
    {
        printf("%s    %s     %s\n", testa->nome, testa->cognome, testa->telefono);
        testa = testa->next;
    }
}

bool ricerca(nodo *testa)
{
    char cerca[100];
    printf("inserisci il nome o il cognome di chi vuoi cercare: ");
    scanf("%s", cerca);

    while (testa != NULL)
    {
        if (strcmp(cerca, testa->nome) == 0 || strcmp(cerca, testa->cognome) == 0)
        {
            printf("contatto trovato");
            break;
        }
        else
        {
            printf("contatto non trovato");
            testa = testa->next;
            break;
        }
    }
}

nodo *rimuovi(nodo *testa)
{
    int cancella;
    printf("inserisci l'elemento da cancellare: ");
    scanf("%d", &cancella);
    nodo *corrente = testa;
    nodo *precedente = NULL;

    if (cancella == 0)
    {
        testa = corrente->next;
    }
    else
    {
        for (int i = 0; i < cancella; i++)
        {
            precedente = corrente;
            corrente = corrente->next;
        }

        precedente->next = corrente->next;
    }

    free(corrente);
    return testa;
}

int main()
{
    nodo *testa = NULL;
    nodo *coda = NULL;

    int scelta = 0;

    while (scelta != 5)
    {
        printf("\n\n1. aggiungi contatto\n");
        printf("2. cerca contatto per nome o cognome\n");
        printf("3. rimuovi contatto\n");
        printf("4. visualizza tutti i contatti\n");
        printf("5. esci\n");
        printf("inserisci l'opzione: ");
        scanf("%d", &scelta);
        switch (scelta)
        {
        case 1: // aggiunge il contatto
            if (testa == NULL)
            {
                testa = inserimentoPrimoElem();
                coda = testa;
            }
            else
            {
                coda = inserimentoPoi(coda);
            }
            break;
        case 2: // cerca il contatto
            ricerca(testa);
            break;
        case 3: // rimuove contatto
            testa = rimuovi(testa);
            break;
        case 4: // visualizza tutti i contatti
            stampa(testa);
            break;
        case 5: // esce
            break;
        default:
            printf("numero non valido");
            break;
        }
    }
    return 0;
}