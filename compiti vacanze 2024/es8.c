#include <stdio.h>
int main(){

    int i;
    int k;
    int temp;
    int scambio;
    int size = 0;

    printf("Inserire la dimensione dell'array: "); //chiede la dimensione dell'array
    scanf("%d", &size);

    int vett[size];

    for(i = 0; i < size; i++){
        printf("Inserire il numero: ");			//Riempe l'array vett
        scanf("%d", &vett[i]);
    }

    k = size - 1;

    do{
        scambio = 0;
        for(i = 0; i < k; i++){				//Ordina l'array in ordine crescente tramite l'algoritmo bubble sort
            if(vett[i] > vett[i + 1]){
                temp = vett[i];
                vett[i] = vett[i + 1];
                vett[i + 1] = temp;
                scambio = 1;
            }
        }
        k--;
    }while(scambio == 1);

    for(i = 0; i < size; i++){ //stampa l'array ordinato
        printf("%d ", vett[i]);
    }

    return 0;
}