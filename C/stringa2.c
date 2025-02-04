#include <stdio.h>
#include <string.h>

int main(){
	char stringa1;
	char stringa2;

	printf("Inserire la prima stringa: ");
	scanf("%s", &stringa1);

	printf("Inserire la seconda stringa: ");
	scanf("%s", &stringa2);
	
	long i = strlen(stringa1);
	long j = strlen(stringa2);
	
	long contatore;
	if(i < j){
		contatore = j/i;
		printf("La prima stringa: %s e' contenuta %d nella seconda: %s", stringa1, contatore, stringa2);
	} else {
		contatore = i/j;
		printf("La seconda stringa: %s e' contenuta %d nella prima: %s", stringa2, contatore, stringa1);
	}
	
	return 0;
}