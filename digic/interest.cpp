//Wap in c to calculate simle interest
#include"stdio.h"
#include"conio.h"
main(){
	int p,r,t,interest;
	printf("Enter your principal:");
	scanf("%d",&p);
	printf("Enter your rate:");
	scanf("%d",&r);
	printf("Enter your time:");
	scanf("%d",&t);
	interest=(p*r*t)/100;
	printf("your total interest:%d",interest);
	
	
}