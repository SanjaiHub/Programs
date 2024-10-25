#include"stdio.h"
main(){
	int num1,num2;
	char op;
	printf("Enter your first number:");
	scanf("%d",&num1);
	printf("Enter your second number:");
	scanf("%d",num2);
	printf("Enter your operator:");
	scanf("%c",&op);
	switch(op){
		case 'c':
			printf("addition %num1 + %num2 is:",num1+num2);
			break;
	}
}