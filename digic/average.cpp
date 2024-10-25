//wap in c to calculate average of three numbers
#include"stdio.h"
#include"conio.h"
main()
{
	int a,b,c;
	printf("Enter First number a is:");
	scanf("%d",&a);
	printf("Enter Second number b is:");
	scanf("%d",&b);
	printf("Enter THird number c is:");
	scanf("%d",&c);
	float average=(a+b+c)/3.0;
	printf("average is :%f",average);
}