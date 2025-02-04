#include <stdio.h>
#include <stdlib.h>


int main(){
    struct Studente *p;
    int dim;
    float media;

    printf("Inserire numero di studenti: ");
    scanf("%d", &dim);

    p = (int*)malloc(dim * sizeof(int));

    struct Studente
    {
        char nome[50];
        int eta;
        float voto;
    }studenti;

    for(int i = 0; i < dim; i++){
        printf("\nInserire il nome: ");
        scanf("%s", (p+i)->nome);
        printf("Inserire l'eta': ");
        scanf("%d", &(p+i)->eta);
        printf("Inserire il voto: ");
        scanf("%f", &(p+i)->voto);
    }

    for(int i = 0; i < dim; i++){
        printf("\nnome : %s\n", (p+i)->nome);
        printf("voto : %d\n", (p+i)->eta);
        printf("media: %.1f\n", (p+i)->voto);
    }

    for(int i = 0; i < dim; i++){
        media = media + (p+i)->voto;
    }

    printf("\nLa media dei voti e' %.1f", media/dim);
    
    free(p);
    return 0;
}
