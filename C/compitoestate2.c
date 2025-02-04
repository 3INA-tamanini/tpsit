#include <stdio.h>
#include <string.h>
int main(){
	char str[100];
	char str2[100];
	int i = 0;
	int j = 0;
	
	printf("inserisci una stringa: ");
	scanf("%s", &str);
	
	j = strlen(str)-1;
	
	for(i=0;i<(strlen(str));i++){
		str2[i]=str[j];
		j--;
	}
	
	if(strcmp(str,str2)==0){
		printf("la stringa e' palindroma");
	}else{
		printf("la stringa non e' palindroma");}
}
