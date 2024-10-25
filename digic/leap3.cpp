#include<stdio.h>
main(){
	int year;
	printf("Enter your year:");
	scanf("%d",&year);
	
	//if((year%400==0)||((year%4==0) && (year%100!=0))){
	if(((year%4==0) && (year%400==0)) || (year%100!=0)){
		printf("Your entered year %d is Leap year \n :",year);	
	}
	else{
		printf("Your entered year %d is not Leap year :",year);
	}
}