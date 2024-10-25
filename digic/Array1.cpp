//input 10 numbers and print sum & average number
#include<stdio.h>
main(){
	float num[10];
	printf("Enter your 10 numbers:");
	for(int i=0;i<10;i++){
		scanf("%f",&num[i]);
	}
	float sum=0;
	for(int i=0;i<10;i++){
		sum=sum+num[i];
	}
	float avg=sum/10;
	printf("\n sum= %f",sum);
	printf("\n Average= %f",avg);
}