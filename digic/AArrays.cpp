//String
#include<stdio.h>
#include<string.h>
main(){
	char n[20];
	printf("Enter your name:-");
//	scanf("%s",&n);
	gets(n);
	printf("\n your name =%s",n);
	
	int a=strlen(n);
	printf("\n length=%d",a);
	
	strupr(n);
	printf("\n upper case=%s",n);
	
	strlwr(n);
		printf("\n Lower case=%s",n);
		
	strrev(n);
		printf("\n reverse case=%s",n);
	


		
		
		


}