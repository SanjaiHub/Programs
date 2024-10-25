//wap in c to convert temperature in celcius from fehrenheit.
#include"stdio.h"
#include"conio.h"
main(){
	float f,c;
	printf("Enter Your fehrenheit temperature:");
	scanf("%f",&f);
	c=((f-32)*5/9);
	printf("celcius temperature is:%f",c);
}