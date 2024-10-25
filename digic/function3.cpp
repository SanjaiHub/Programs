#include<stdio.h>
void beta();
void alpha();
int a=26;//global
main(){
	int a=15;
	printf("A in main =%d",a);
	alpha();
	beta();
	
}
void alpha(){
	printf("\nSanjay Kashyap");
//	int a=20;
	printf("\n A in Alpha =%d",a);
//	alpha(); recursion
}
void beta(){
//	int a=12; //local
		printf("\n A in beta =%d",a);	
}