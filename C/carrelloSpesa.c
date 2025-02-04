#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

typedef struct carrelloSpesa
{
    char nome[100];
    int prezzo;
    int quantita;
    struct nodo *next;
} nodo;

nodo *inserimentoPrimoElemento()
{
    nodo *temp = (nodo *)malloc(sizeof(nodo));

    printf("inserisci il prodotto: ");
    scanf("%s", &temp->nome);
    printf("inserisci il prezzo: ");
    scanf("%d", &temp->prezzo);
    printf("inserisci la quantita: ");
    scanf("%d", &temp->quantita);

    temp->next = NULL;

    return temp;
}

nodo *inserimentoInCoda(nodo *coda)
{
    nodo *temp = (nodo *)malloc(sizeof(nodo));
    printf("inserisci il prodotto: ");
    scanf("%s", &temp->nome);
    printf("inserisci il prezzo: ");
    scanf("%d", &temp->prezzo);
    printf("inserisci la quantita: ");
    scanf("%d", &temp->quantita);

    temp->next = NULL; // imposta il puntatore al prossimo elemento a NULL
    coda->next = temp; // collega il nuovo nodo alla fine della lista
    return temp;
}

nodo *rimuovi(nodo *testa)
{
    char elemento[100];
    printf("inserisci il nome dell'elemento da rimuovere: ");
    scanf("%s", &elemento);

    nodo *corrente = testa;
    nodo *precedente = NULL;

    while (corrente != NULL && corrente->nome != elemento)
    {
        precedente = corrente;
        corrente = (nodo *)corrente->next;

        if (corrente == NULL)
        {
            printf("elemento non trovato");
            return testa;
        }

        if (precedente == NULL)
        {
            testa = (nodo *)corrente->next;
        }
        else
        {
            precedente->next = corrente->next;
        }

        free(corrente);
        printf("elemento rimosso\n");
        return testa;
    }
}

int calcola(nodo *scorriLista)
{
    int prezzotot = 0;
    while (scorriLista != NULL)
    {
        prezzotot += (scorriLista->prezzo * scorriLista->quantita);
        scorriLista = (nodo *)scorriLista->next;
    }
    return prezzotot;
}

void stampa(nodo *testa)
{
    while (testa != NULL)
    {
        printf("prodotto: %s\n", testa->nome);
        printf("prezzo  : %d\n", testa->prezzo);
        printf("quantita: %d\n\n", testa->quantita);
        testa = (nodo *)testa->next;
    }
}

int menu()
{
    int temp;
    printf("\n\n1. Inserisci\n2. rimuovi\n3. totale\n4. stampa\n5. esci\n");
    scanf("%d", &temp);
    return temp;
}

int main()
{
    nodo *testa = NULL;
    nodo *coda = NULL;
    int scelta = 0;

    while (scelta != 5)
    {
        scelta = menu();

        switch (scelta)
        {
        case 1:
            if (testa == NULL)
            {
                testa = inserimentoPrimoElemento();
                coda = testa;
            }
            else
            {
                coda = inserimentoInCoda(coda);
            }
            break;
        case 2:
            testa = rimuovi(testa);
            break;
        case 3:
            printf("il totale e': %d", calcola(testa));
            break;
        case 4:
            stampa(testa);
            printf("totale  : %d\n", calcola(testa));
        default:
            break;
        }
    }
}
