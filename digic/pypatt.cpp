#include"stdio.h"
main(){
	int n=5;
	for(int i=0;i<n;i++){
		//spaces
		for(int j=0;j<n-i-1;j++){
			printf("  ");
		}
		//stars
		for(int j=0;j<2*i+1;j++){
			printf("* ");
			
			
		}
		printf("\n");
	}
}