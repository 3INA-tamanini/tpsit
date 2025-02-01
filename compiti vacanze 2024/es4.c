#include <stdio.h>
int main(){
    int size = 0;
    int i = 0;
    int *p;

    printf("Inserire la dimensione dell'array: ");
    scanf("%d", &size);

    int numeri[size];
    int copia[size];

    p = numeri;						//p punta il primo valore di numeri

    for(i = 0; i < size; i++){
        printf("Inserire il %d numero: ", i+1);		//Riempe l'array
        scanf("%d", &*(p+i));
    }

    p = &numeri[size-1];				//Si fa puntare a p l'ultima posizione dell'array numeri

    for(i = 0; i < size; i++){				//Copia all'interno di copia i valori contenuti in numeri partendo dall'ultimo e muovendosi verso il primo
        copia[i] = *(p-i);
    }

    p = copia;						//Si fa puntare a p la posizione del primo valore di copia

    for(i = 0; i < size; i++){
        printf("%d", *(p+i));
    }

    return 0;
}