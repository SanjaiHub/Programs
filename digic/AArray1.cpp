//Addition of two matrix
#include<stdio.h>
main(){
	int a[3][3];
	int b[3][3];
	int sum[3][3];
	int r,c;

	printf("enter first matrix of 3x3 -:");
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
			scanf("%d",&a[r][c]);
		}
	}
	printf("Enter Second matrix of 3x3 -:");
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
			scanf("%d",&b[r][c]);
		}
	}
	
	//sum of matrix
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
			sum[r][c]=a[r][c]+b[r][c];	
			
		}
	}
	
	printf("\n your first matrix=\n");
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
			printf("%d ",a[r][c]);
		}
		printf("\n");
	}
	printf("\n your second matrix =\n");
		for(r=0;r<3;r++){
		for(c=0;c<3;c++){
			printf("%d ",b[r][c]);
		}
		printf("\n");
	}
	
	printf("\n sum of matrix=\n");
		for(r=0;r<3;r++){
		for(c=0;c<3;c++){
			printf("%d ",sum[r][c]);
		}
		printf("\n");
	}
	
}