#include <stdio.h>
int main(){
	double a,b,c,d, media;
	printf("Primo valore: ");
	scanf("%f", &a);
	printf("Secondo valore: ");
	scanf("%f", &b);
	printf("Terzo valore: ");
	scanf("%f", &c);
	printf("Quarto valore: ");
	scanf("%f", &d);
	media = ((a+b+c+d)/4);
	printf("la media e': %.2f", media);
	;return 0;
}
