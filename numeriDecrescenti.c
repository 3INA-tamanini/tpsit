#include <stdio.h>

int main(){
	int a,b,c;
	printf("inserisci a: ");
	scanf("%d",&a);
	printf("inserisci b: ");
	scanf("%d",&b);
	printf("inserisci c: ");
	scanf("%d",&c);
	
	if(a>b && a>c){
		if(b>c){
			printf("%d %d %d", a,b,c);
		}else{
			printf("%d %d %d", a,c,b);
		}
	}else if(b>a && b>c){
		if(a>c){
			printf("%d %d %d", b,a,c);
		}else{
			printf("%d %d %d", b,c,a);
		}
	}else if(c>a && c>b){
		if(a>b){
			printf("%d %d %d", c,a,b);
 		}else{
 			printf("%d %d %d", c,b,a);
		 }
	}
	
}