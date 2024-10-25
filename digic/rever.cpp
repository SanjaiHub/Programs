#include<stdio.h>
main(){
	int n,reverse=0;
	printf("Enter your number you want to reverse order:");
	scanf("%d",&n);
	while(n!=0){ //n>0
	//	rem=n%10;
		reverse=reverse*10+n%10;
		n/=10;
	}
	printf("Reversed number is :%d ",reverse);
	
}
