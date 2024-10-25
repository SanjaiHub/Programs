//ternary operator
#include"stdio.h"
main(){
	/*
	int a,b;
	
printf("Enter two number :");
scanf("%d%d",&a,&b);
//a>b?printf("a"):printf("b");
//a>=b?printf("a"):printf("b");
//a==b?printf("a"):printf("b");
a==b?printf("a"):printf("b");
*/

/*
int a,b ,c;
printf("Enter three number :");
scanf("%d%d%d",&a,&b,&c);
int x=(a>b)?(a>c)?a:c:(b>c)?b:c;
printf("max number is :%d",x);


*/

int a,b,c,d;
printf("Enter four number :");
scanf("%d%d%d%d",&a,&b,&c,&d);
int x=(a>b)?(a>c)?(a>d)?a:d:(c>d)?c:d:(b>c)?(b>d)?b:d:(c>d)?c:d;
printf("max number is :%d",x);


}