#include<stdio.h>
int qube(int num);
main(){
	int x=qube(4);
	printf("Answer =%d",x);
}

int qube(int num){
	int a=num*num*num;
	return a;
}