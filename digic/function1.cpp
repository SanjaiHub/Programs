#include<stdio.h>
void table(int num);
main(){
	table(2);
	table(3);
	table(4);
	table(5);
}

void table(int num){
	for(int i=1;i<=10;i++){
		printf("%d\t",i*num);
	}
	printf("\n");
}