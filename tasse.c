/*Descrizione: Crea un programma per gestire lo storico delle transazioni bancarie di un utente.
Ogni transazione deve contenere la data, l'importo e il tipo di transazione (ad esempio, "Deposito" o "Prelievo").
Funzionalità richieste:
Implementa le seguenti funzionalità:
Aggiungi una transazione allo storico.
Visualizza tutte le transazioni in ordine cronologico.
Calcola il saldo totale (sommando i depositi e sottraendo i prelievi).
Usa una lista collegata per memorizzare le transazioni.*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct tasse
{
    char data[100];
    int importo;
    char tipo[100];
    struct tasse *next;
} nodo;

void menu()
{
    printf("1. aggiungi transazione\n");
    printf("2. visualizza transazioni\n");
    printf("3. calcola saldo totale\n");
    printf("4. esci\n");
}

nodo *inserimentoPrimoElemento()
{
    nodo *temp = (nodo *)malloc(sizeof(nodo));

    printf("insericsi la data: ");
    scanf("%s", temp->data);
    printf("inserisci il tipo di transazione:  ");
    scanf("%s", temp->tipo);
    printf("inserisci l'importo: ");
    scanf("%d", &temp->importo);
    temp->next = NULL;
    return temp;
}

nodo *inserimentoInCoda(nodo *coda)
{
    nodo *temp = (nodo *)malloc(sizeof(nodo));
    printf("insericsi la data: ");
    scanf("%s", temp->data);
    printf("inserisci il tipo di transazione: ");
    scanf("%s", temp->tipo);
    printf("inserisci l'importo: ");
    scanf("%d", &temp->importo);
    temp->next = NULL;
    coda->next = temp;
    return temp;
}

void visualizza(nodo *testa)
{
    while (testa != NULL)
    {
        printf("\ntipo di transazione: %s\n", testa->tipo);
        printf("data: %s\n", testa->data);
        printf("importo: %d\n\n", testa->importo);
        testa = (nodo *)testa->next;
    }
}

int calcola(nodo *testa)
{
    int tot = 0;
    while (testa != NULL)
    {
        if (strcmp(testa->tipo, "deposito") == 0)
        {
            tot += testa->importo;
        }
        else
        {
            tot -= testa->importo;
        }
        testa = (nodo *)testa->next;
    }
    return tot;
}

int main()
{
    nodo *testa = NULL;
    nodo *coda = NULL;
    int scelta = 0;

    while (scelta != 4)
    {
        menu();
        printf("inserisci l'opzione: ");
        scanf("%d", &scelta);
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
            visualizza(testa);
            break;
        case 3:
            printf("il saldo totale e': %d\n", calcola(testa));
        case 4:
        default:
            break;
        }
    }
    return 0;
}