#include<stdio.h>
main(){
	int num,i;
	printf("Enter your number you want to find table :");
	scanf("%d",&num);
	for(i=1;i<=10;i++){
		printf("\n %d*%d: %d ",num,i,(num*i));
	}
}