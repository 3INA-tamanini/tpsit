#include <stdio.h>
int main(){
	char c;
	printf("Inserire un carattere: ");
	scanf("%c", &c);
	
	switch(c){
		case 'a' ... 'z':
			printf("Lettera minuscola ");
			break;
		
		case 'A' ... 'Z':
			printf("Lettera maiuscola");
			break;

        case '.':
            printf("punto");
            break;

        case ',':
            printf("virgola");
            break;

        case ';':
            printf("punto e virgola");
            break;

        case '!':
            printf("punto esclamativo");
            break;

        case '?':
            printf("punto interrogativo");
            break;

        case ':':
            printf("due punti");
            break;
			
		default:
			printf("no");
	}
	
	return 0;
}

