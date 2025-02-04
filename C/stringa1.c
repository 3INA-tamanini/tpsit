#include <stdio.h>
#include <string.h>

int main(){
	char stringa1[9] = {"CiaoCiao"};
	char stringa2[10] = {"CiaoXCiao"};
	
	long i= strlen(stringa1);
	
	if(i%2 == 0){
		int y, uguali = 1;
		for(y = 0; y < i/2 ; y++){
			if(stringa1[y] != stringa1[y+i/2]){
				uguali = 0;
			}
		}
		if(uguali == 1){
			printf("La stringa %s e' composta da due parti uguali \n", stringa1);
		} else {
			printf("La stringa %s non e' composta da due parti uguali \n", stringa1);
		}
	} else {
		int y, uguali = 1;
		for(y = 0; y < i/2 ; y++){
			if(stringa1[y] != stringa1[y+1+i/2]){
				uguali = 0;
			}
		}
		if(uguali == 1){
			printf("La stringa %s e' composta da due parti uguali \n", stringa1);
		} else {
			printf("La stringa %s non e' composta da due parti uguali \n", stringa1);
		}
	}
	

  

	
	long j= strlen(stringa2);
	
	if(j%2 == 0){
		int y, uguali = 1;
		for(y = 0; y < j/2 ; y++){
			if(stringa1[y] != stringa1[y+j/2]){
				uguali = 0;
			}
		}
		if(uguali == 1){
			printf("La stringa %s e' composta da due parti uguali", stringa2);
		} else {
			printf("La stringa %s non e' composta da due parti uguali", stringa2);
		}
	} else {
		int y, uguali = 1;
		for(y = 0; y < j/2 ; y++){
			if(stringa1[y] != stringa1[y+1+j/2]){
				uguali = 0;
			}
		}
		if(uguali == 1){
			printf("La stringa %s e' composta da due parti uguali", stringa2);
		} else {
			printf("La stringa %s non e' composta da due parti uguali", stringa2);
		}
	}
	
	return 0;
}
