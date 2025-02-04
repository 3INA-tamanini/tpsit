#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// Definizione della struttura nodo per la lista collegata
typedef struct elemento
{
    int informazione;
    struct elemento *next;
} nodo;

/* Prototipi delle funzioni */
int menu(void);
nodo *inserimentoPrimoElemento(void);
nodo *inserimentoInCoda(nodo *coda);
bool ricerca(nodo *testa);
void stampa(nodo *testa);
nodo *elimina(nodo *testa);

int main(void)
{
    nodo *testa = NULL; // Puntatore al primo elemento della lista (inizializzato a NULL)
    nodo *coda = NULL;  // Puntatore all'ultimo elemento della lista
    int scelta = 0;     // Variabile per la scelta dell'utente

    // Ciclo per gestire le opzioni del menu finché l'utente non sceglie di uscire
    while (scelta != 5)
    {
        scelta = menu(); // Ottiene l'input dell'utente tramite il menu

        // Switch per gestire le varie opzioni del menu
        switch (scelta)
        {
        case 1:
            if (testa == NULL)
            {
                testa = inserimentoPrimoElemento(); // Inserisce il primo elemento
                coda = testa;                       // Imposta il puntatore alla coda alla testa perché c'è un solo elemento
            }
            else
            {
                coda = inserimentoInCoda(coda); // Inserisce un elemento in coda
            }
            break;
        case 2:
            if (ricerca(testa))
            {
                printf("Elemento trovato\n");
            }
            else
            {
                printf("Elemento non trovato\n");
            }
            break;
        case 3:
            stampa(testa); // Stampa la lista
            break;
        case 4:
            testa = elimina(testa); // Elimina l'elemento dalla lista
            break;
            // Da implementare: eliminazione di un elemento

        case 5:
            printf("Uscita dal programma.\n");
            // Libera la memoria allocata prima di uscire
            while (testa != NULL)
            {
                nodo *temp = testa;
                testa = testa->next;
                free(temp);
            }
            break;

        default:
            printf("Scelta non valida\n");
            break;
        }
    }
    return 0;
}

// Funzione per visualizzare il menu e ottenere la scelta dell'utente
int menu()
{
    int temp;
    printf("\n\n1. Inserisci\n2. Ricerca\n3. Stampa\n4. Elimina\n5. Esci\n");
    scanf("%d", &temp);
    return temp;
}

// Funzione per inserire il primo elemento nella lista
nodo *inserimentoPrimoElemento()
{
    nodo *temp = (nodo *)malloc(sizeof(nodo)); // Alloca memoria per un nuovo nodo
    printf("Inserisci l'elemento: ");
    scanf("%d", &temp->informazione);
    temp->next = NULL; // Imposta il puntatore al prossimo elemento a NULL
    return temp;
}

// Funzione per inserire un elemento in coda alla lista
nodo *inserimentoInCoda(nodo *coda)
{
    nodo *temp = (nodo *)malloc(sizeof(nodo)); // Alloca memoria per un nuovo nodo
    printf("Inserisci l'elemento: ");
    scanf("%d", &temp->informazione);
    temp->next = NULL; // Imposta il puntatore al prossimo elemento a NULL
    coda->next = temp; // Collega il nuovo nodo alla fine della lista
    return temp;
}

// Funzione per cercare un elemento nella lista
bool ricerca(nodo *scorriLista)
{
    bool temp = false;
    int elemento;
    printf("Inserisci l'elemento da trovare: ");
    scanf("%d", &elemento);

    while (scorriLista != NULL && !temp)
    {
        if (scorriLista->informazione == elemento)
        {
            temp = true;
        }
        scorriLista = scorriLista->next;
    }
    return temp;
}

void stampa(nodo *scorriLista)
{
    while (scorriLista != NULL)
    {
        printf("puntatore all'elemento: %p\n", (void *)scorriLista);
        printf("elemento informazione: %d\n", scorriLista->informazione);
        printf("puntatore al prossimo elemento: %p\n", (void *)scorriLista->next);
        scorriLista = scorriLista->next;
    }
}

nodo *elimina(nodo *testa)
{
    int elemento;
    printf("inserisci l'elemento da eliminare: ");
    scanf("%d", &elemento);

    nodo *corrente = testa;
    nodo *precedente = NULL;

    // cerca l'elemento da eliminare
    while (corrente != NULL && corrente->informazione != elemento)
    {
        precedente = corrente;
        corrente = corrente->next;
    }
    // se l'elemento non è stato trovato
    if (corrente == NULL)
    {
        printf("elemento non trovato");
        return testa;
    }
    // se l'elemento da eliminare è il primo della lista

    if (precedente == NULL)
    {
        testa = corrente->next; // cambia la testa della lista
    }
    else
    {
        precedente->next = corrente->next; // rimuove l'elemento dalla lista
    }

    free(corrente); // dealloca la memoria dell'elemento
    printf("elemento eliminato\n");
    return testa;
}