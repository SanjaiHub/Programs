//wap in c to find max  number from  two numbers using ternary operator.
#include"stdio.h"
#include"conio.h"
main(){
	int a,b,max;
	printf("Enter first number=");
	scanf("%d",&a);
	printf("Enter second number=");
	scanf("%d",&b);
	max=(a>b)?a:b;
	printf("maximum number is=%d",max);
	
}
