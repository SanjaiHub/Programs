/*
#include<stdio.h>
main(){
	int fact=1,n;
	printf("Enter your number you want to find fact:");
	scanf("%d",&n);
	if(n<0){
		printf("Entered number is invalid");
	//	return 0;
	}
	for(int  i=n;i>=1;i--){
		fact=fact*i;
			
	}
	printf("factorial is:%d",fact);
}
*/


#include"stdio.h"
main(){
	int n;
	printf("Entered your number you want to factorial:");
	scanf("%d",&n);
	if(n<0){
		printf("entered your number is invalid");
	}
	double fact=1;
	for(double i=n;i>=1;i--){
		fact=fact*i;
	}
	printf("Factorial is:%lf",fact);
}

