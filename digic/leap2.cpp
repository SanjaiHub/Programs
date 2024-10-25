#include<stdio.h>
main(){
	int year;
	printf("Enter your year:");
	scanf("%d",&year);
	
	if(((year%4==0) && (year%400==0)) || (year%100!=0)){
		printf("Your entered year %d is Leap year :",year);	
	}
	else{
		printf("Your entered year %d is Leap year :",year);
	}
}