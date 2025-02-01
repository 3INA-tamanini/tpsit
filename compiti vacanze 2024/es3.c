#include <stdio.h>
int main(){
    int size = 0;
    int i = 0;
    int j = 0;

    printf("Inserire la dimensione dell'array: "); //chiedo la dimensione dell'array
    scanf("%d", &size);
    
    int numeri[size];
    int copia[size];

    for(i = 0; i < size; i++){
        printf("Inserire il %d numero: ", i+1);		//Riempe l'array
        scanf("%d", &numeri[i]);
    }

    j = size-1;						//A j viene assegnato l'ultimo valore di uno dei due array

    for(i = 0; i < size; i++){
        copia[i] = numeri[j];				//Copia all'interno di copia il contenuto di numeri al contrario partendo da j
        j--;
    }
    
    for(i = 0; i < size; i++){ //stampa l'array nuovo
        printf("%d", copia[i]);
    }    
    
    return 0;
}