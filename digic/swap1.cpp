//wap in c to swap the value of two variable with the help of third variable
#include"stdio.h"
main(){
	int a,b,temp;
	printf("Enter value of a:");
	scanf("%d",&a);
	printf("Enter value of b:");
	scanf("%d",&b);
	temp=a;
	a=b;
	b=temp;
	printf("\n After swapping value  of a is:%d",a);
	printf("\n After swapping  value of b is:%d",b);
}