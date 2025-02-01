#include <stdio.h>
#include <string.h>

int main(){


char stringa1[100];

printf("Inserire un testo: "); //chiedo una stringa
    scanf("%s", stringa1);
   
long i= strlen(stringa1); 

int*p,*k;

if(i%2 == 0){
p=stringa1;
k=stringa1+i/2;

} else {
p=stringa1;
k=stringa1+i/2+1;
}
int y, uguali = 1;
for(y = 0; y < i/2 ; y++){
if(*p != *k){
uguali = 0;
}
}
if(uguali == 1){
printf("La stringa %s e' composta da due parti uguali \n", stringa1);
} else {
printf("La stringa %s non e' composta da due parti uguali \n", stringa1);
}

return 0;
}