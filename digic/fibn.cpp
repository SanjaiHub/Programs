/*
//using while loop
#include"stdio.h"
main(){
	int t1,t2,t3,n;
	t1=0,t2=1;
	printf("Enter your  number for fibonacci: ");
	scanf("%d",&n);
	printf("fibonacci series is: %d%d ",t1 ,t2);
	t3=t1+t2;
	while(t3<=n){
		printf("%d ",t3);
		t1=t2;
		t2=t3;
		t3=t1+t2;
	}	
}

*/

//using for loop
#include"stdio.h"
main(){
	int t1=0,t2=1,t3,i,n;
	printf("Enter your number of terms for fibonacci series: ");
	scanf("%d",&n);
	printf("Fibonacci series is:%d %d ",t1,t2);
	t3=t1+t2;
	for(i=3;i<=n;++i){
		printf("%d  ",t3);
		t1=t2;
		t2=t3;
		t3=t1+t2;
	}
	
	
	
}
