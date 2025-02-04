#include <stdio.h>

int max(int a, int b, int c)
{
    int max;
    if (a > b && a > c)
        max = a;
    else if (b > c)
        max = b;
    else
        max = c;

    return max;
}


int min(int a, int b, int c)
{
    int min;
    if (a < b && a < c)
        min = a;
    else if (b < c)
        min = b;
    else
        min = c;

    return min;
}


int main()
{
    int a = 5, b = 32, c = 10;
    printf("il valore massimo è: %d \n", max(a, b, c));
    printf("il valore minimo è: %d", min(a, b, c));
    return 0;
}