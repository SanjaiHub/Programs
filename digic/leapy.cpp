 
#include"stdio.h"
main(){
	int year;
	printf("enter your year:");
	scanf("%d",&year);
	if(year%400==0){
		printf(" your entered year %d is leap year \n ",year);
	}else if(year%100==0){
		printf(" your entered year %d is not leap year \n",year);
	}
	else if(year%4==0){
		printf(" your entered year %d is leap year \n ",year);
	}else{
		printf("your entered year %d is not leap year ",year);
	}
	
}