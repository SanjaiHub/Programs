//switch
#include"stdio.h"
main()
{
	int num;
	printf("Enter a number 1 to 5:");
	scanf("%d",&num);
	switch(num){
		case 1:
			printf("one");
			break;
			
	    case 2:
			printf("two");
			break;
		case 5:
			printf("three");
			break;
		case 4:
			printf("four");
			//break;
		case 3:
			printf("five");
			break;
		default:
			//printf("number is out of range=%d",num);
			printf("invalid number");
	}
}