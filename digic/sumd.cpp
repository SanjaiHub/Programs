#include"stdio.h"
main(){
	int n,sum=0;
	printf("Enter your number you want to find sum of digit:");
	scanf("%d",&n);
	while(n>0 ||n!=0){
		sum=sum+n%10;
		n=n/10;
	}
	printf("sum of digit: %d",sum);
}