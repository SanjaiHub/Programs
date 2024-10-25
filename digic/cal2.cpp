#include"stdio.h"
main(){
	char op;
	int num1,num2, c;
	
	printf("Enter your two  number:");
	scanf("%d%d",&num1,&num2);
	printf("Enter your operator:");
	scanf("%s",&op);
	switch(op){
		case '+':
	    	printf("addition is num1+num2:%d",num1+num2);
	    	break;
		case '-':
		    printf("Substraction is num1-num2:%d",num1-num2);
		    break;
		case '*':
		printf("Multiplication is num1*num2:%d",num1*num2);
		break;
		case '/':
			if(num2==0){
				printf("invalid");
			}else{
				printf("Division is num1/num2:%d",num1/num2);
				return 1;
			}
		       break;
			   default:
			   printf("invalid operator");	
	}
}