#include<stdio.h>
main(){
	int num,rem,orgnum,result=0;
	printf("Enter your number you want to check armstrong:");
	scanf("%d",&num);
	orgnum=num;
	while(orgnum!=0){
		rem=orgnum%10;
		result+=(rem*rem*rem);
		orgnum/=10;
	}
	if(result==num){
		printf("Entered number is Armstrong: %d",num);
	}else{
		printf(" entered number is not armstrong:%d",num);
	}
}