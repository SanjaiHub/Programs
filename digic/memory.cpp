//get memory address of variable
#include"stdio.h"
main(){
	int a=10;
	printf("Value of A=%d",a);
	printf("\n Address of Variable A=%d",&a);
	printf("\n Size of Variable A=%d",sizeof(a));//sizeof function return always integer value
}
