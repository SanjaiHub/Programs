//wap in c to swap the value of two variable without help of third varible
#include"stdio.h"
main(){
	int a,b;
	printf("Enter value of a:");
	scanf("%d",
	&a);
	printf("Enter value of b:");
	scanf("%d",&b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("\n After swappng value a is:%d",a);
	printf("\n after swapping value b is :%d",b);
}