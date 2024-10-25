#include<stdio.h>
main(){
	int n,reverse=0,rem,orgnum;
	printf("Enter your number you want to check palindrome or not:");
	scanf("%d",&n);
	orgnum=n;
	while(n!=0){
		rem=n%10;
		reverse=reverse*10+rem;
		n/=10;
	}
	if(orgnum==reverse){
		printf("Entered number is palindrome:%d",orgnum);
	}
	else
	printf("Enteres number is not palindrome:%d",orgnum);
	
}