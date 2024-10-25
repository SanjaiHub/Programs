#include"stdio.h"
main(){
	char ch;
	printf("Entered your character:- ");
	scanf("%c",&ch);
	if((ch>='A'&& ch<='Z')||(ch>='a' && ch<='z')){
	
	if(ch=='a'||ch=='A'|| ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
		printf("Your Entered character %c is Vowel",ch);
	}else{
		printf("Entered character %c is Consonant",ch);
	}
}else{
	printf("Your entered character is neither -vowel nor- consonant  ");
}
}