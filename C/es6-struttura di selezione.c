#include <stdio.h>

int main() {
    int numero;
    
    printf("inserisci un voto: ");
    scanf("%d", &numero);
    if (numero < 18)
        printf("Insufficiente");
    else {
        switch (numero) {
            case 18:
                printf("Appena sufficiente");
                break;
            case 19:
            case 20:
                printf("Basso");
                break;
            case 21:
            case 22:
            case 23:
                printf("Medio");
                break;
            case 24:
            case 25:
            case 26:
                printf("Buono");
                break;
            case 27:
            case 28:
            case 29:
                printf("Alto");
                break;
            case 30:
                printf("Massimo");
                break;
            default:
                printf("Impossibile");
                break;
        }
    }

    return 0;
}
