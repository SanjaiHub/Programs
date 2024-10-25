#include"stdio.h"
main(){
	int num;
	printf("Enter your number you want to check number is prime or not:");
	scanf("%d",&num);
	int count=0;
	int n=1;
	while(n<=num){
		if(num%n==0){
			count++;
		
		}
		n++;
	}
	if(count==2){
		printf("number is prime");
	}
	else{
		printf("Number is non-prime:");	
	}
}