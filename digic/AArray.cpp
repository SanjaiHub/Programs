//2D Array -input / Output
#include<stdio.h>
main(){
	int x[3][3];
	printf("Enter a matrix of 3*3 -: ");
	//for input 
	int r,c;
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
			scanf("%d",&x[r][c]);
		}
	}
	//for Output
	printf("\n Your matrix \n");
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
			printf("%d ",x[r][c]);
		}
		printf("\n");
		
	}
	
}