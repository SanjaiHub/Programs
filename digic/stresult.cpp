#include"stdio.h"
 main(){
	int marks;
	printf("Enter student marks:");
	scanf("%d",&marks);
	if(marks>=75 &&marks<=100){
		printf("Grade A:pass first division ");
	}else if(marks>=60 && marks<75){
		printf("Grade B: pass second division");
	}else if(marks>=34 && marks<60){
		printf("Grade C: pass third division ");
	}else if(marks>=0 && marks<34){
		printf("you will fail");
	}else{
		printf("invalid percentage");
	}
	
}