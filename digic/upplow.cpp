#include"stdio.h"
main(){
	char ch;
	printf("Enter your character:");
	scanf("%c",&ch);
	
	if(ch>='A'&& ch<='Z'){
		printf("Entered character %c is Uppercase",ch);
	}else if(ch>='a' && ch<='z'){
		printf("Entered character %c is lowercase",ch);
	}
	else{
		printf("Entered character %c is not alphabetical ",ch);
	}
}