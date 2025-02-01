#include <stdio.h>

int main()
{
    int numero;
    printf("inserisci un voto: ");
    scanf("%d", &numero);
    
    
    if(numero<18)
    printf("insufficiente");
    else if(numero==18)
        printf("Appena sufficiente");
        else if(numero>=19 && numero<=20)
            printf("Basso");
            else if(numero>=21&&numero<=23)
                printf("Medio");
                else if(numero>=24&&numero<=26)
                    printf("Buono");
                    else if(numero>=27&&numero<=29)
                        printf("Alto");
                        else if(numero==30)
                            printf("Massimo");
                            else if(numero>30)
                                printf("impossibile");
    return 0;
}