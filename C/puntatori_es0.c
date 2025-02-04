/*
Dichiarare due variabili intere, e due puntatori coerenti.
Puntare a tali variabili, quindi verificare che i due indirizzi sono differenti fra loro,mediante un semplice confronto fra i puntatori .
*/

#include <stdio.h>

int main()
{
    int a = 10;
    int b = 20;
    int *c = &a;
    int *d = &b;

    printf("%d\n", a);
    printf("%d\n", b);
    printf("%p\n", c);
    printf("%p\n", d);

    if (c != d)
    {
        printf("i puntatori hanno valori diversi\n");
    }
    else
    {
        printf("i puntatori hanno valori uguali");
    }
}