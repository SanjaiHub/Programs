#include"stdio.h"
main(){
	int n;
	printf("Enter your number till which you want even number: ");
	scanf("%d",&n);
	for(int i=1;i<=n;i++){
		if(i%2==0){
			printf(":%d ",i);
		}
	}
}