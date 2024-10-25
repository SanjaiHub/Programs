#include"stdio.h"
int main(){
	int daynum;
	printf("Enter you day number:");
	scanf("%d",&daynum);
	if(daynum>7 ||daynum<=0){
		printf("invalid daynumber");
		return 1;
	}
	switch(daynum)
	{
		    case 1:
			printf("today is monday");
			break;
			case 2:
			printf("today is tuesday");
			break;
			case 3:
			printf("today is wednesday");
			break;
			case 4:
			printf("today is thursday");
			break;
			case 5:
			printf("today is friday");
			break;
			case 6:
			printf("today is saturday");
			break;
			case 7:
			printf("today is sunday");
			break;
	}
}