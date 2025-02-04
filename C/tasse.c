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

typedef struct tasse
{
    char data[100];
    float importo;
    char tipo[100]; //importo o prelievo
}nodo;


nodo* inserisciPrimo(){
    nodo* temp = (nodo*)malloc(sizeof(nodo));
    printf("inserisci il tipo di transazione: ");
    scanf("%s", temp->tipo);
    printf("inserisci la data: ");
    scanf("%s", temp->data);
    printf("inserisci l'importo: ");
    scanf("%f", temp->importo);
    
}
