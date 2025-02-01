#include <stdio.h>

int main()
{
    int arr[3] = {10, 20, 30};
    int *p = arr;                       // p punta al primo elemento dell'array
    p++;                                // Ora p punta al secondo elemento
    printf("Secondo valore: %d\n", *p); // Stampa 20
}