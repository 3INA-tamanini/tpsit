#include <stdio.h>
#include <string.h>
int main()
{
    char stringa1[100];
    int falso = 0;
    char *ptr1;
    char *ptr2;
    printf("Inserisci la stringa: ");
    scanf("%s", stringa1);
    int lunghezza = strlen(stringa1);
    ptr1 = stringa1;
    ptr2 = stringa1 + lunghezza / 2;
    if (lunghezza % 2 == 0)
    {
        printf("La lunghezza della stringa e pari\n");
        for (int a = 0; a < lunghezza / 2; a++)
        {
            if (*(ptr1 + a) != *(ptr2 + a))
            {
                falso = 1;
                break;
            }
        }
    }
    else
    {
        printf("La lunghezza della stringa e' dispari\n");
        for (int a = 0; a < lunghezza / 2; a++)
        {
            if (*(ptr1 + a) != *(ptr2 + 1 + a))
            {
                falso = 1;
                break;
            }
        }
    }
    if (falso)
    {
        printf("Le due parti sono diverse\n");
    }
    else
    {
        printf("Le due parti sono uguali\n");
    }
    return 0;
}