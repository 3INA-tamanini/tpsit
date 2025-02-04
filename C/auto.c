
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    int numeroMacchine;
    char marcaDaCercare[50];

    typedef struct
    {
        char Telaio[50];
        char Marca[50];
        char Modello[50];
        int Cilindrata;
    } Auto;

    Auto *ptr;
    int n;

    printf("quante auto vuoi inserire?: ");
    scanf("%d", &n);

    ptr = (Auto *)malloc(n * sizeof(ptr));

    for (int i = 0; i < n; i++)
    {

        printf("inserisci la marca dell'auto: ");
        scanf("%s", (ptr + i)->Marca);
        printf("inserisci il modello dell'auto: ");
        scanf("%s", (ptr + i)->Modello);

        printf("inserisci il telaio dell'auto: ");
        scanf("%s", (ptr + i)->Telaio);

        printf("inserisci la cilindrata dell'auto: ");
        scanf("%d", &(ptr + i)->Cilindrata);
    }

    printf("quale marca vuoi cercare: ");
    scanf("%s", marcaDaCercare);

    for (int j = 0; j < n; j++)
        if (strcmp((marcaDaCercare), (ptr + j)->Marca) == 0)
        {
            numeroMacchine++;
        }

    printf("Ci sono %d macchine di marca %s", numeroMacchine, marcaDaCercare);

    free((ptr));

    return 0;
}
