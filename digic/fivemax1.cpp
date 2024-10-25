#include"stdio.h"
main(){
	int a,b,c ,d,e;
	printf("Enter a ,b,c,d,e,number :");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	int x=(a>b)?(a>c)?(a>d)?(a>e)?a:e:(d>e)?d:e:(c>d)?(c>e)?c:e:(b>c)?(b>d)?(b>e)?b:e:(d>e)?d:e:(c>d)?(c>e)?c:e:(d>e)?d:e:(d>e)?d:e;
		printf("max number :%d",x);
}