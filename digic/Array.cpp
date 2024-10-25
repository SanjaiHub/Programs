//Array input /Output
#include<stdio.h>
main(){
	int a[5];
	printf("Enter Five number-:");
//	scanf("%d",&a[0]);
    for(int i=0;i<5;i++){
    	scanf("%d",&a[i]);	
	}
	printf("\n You entered these numbers - \n");
	for(int i=0;i<5;i++){
		printf("%d ",a[i]);
	}

}