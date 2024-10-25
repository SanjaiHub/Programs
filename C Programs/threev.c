//wap to print graetest number among 3 given numbers
/*#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter Three No.=");
    scanf("%d%d%d",&a,&b,&c);
    if(a>=b&&a>=c)
     printf("%d",a);
    else{

      if(b>=a&&b>=c)
       printf("%d",b);
       else
        { 
          if(c>=a&&c>=b)
           printf("%d",c);
        }
    }
    getch();
}*/
//wap to print graetest number among 3 given numbers
/*#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter Three No.=");
    scanf("%d%d%d",&a,&b,&c);
    if(a>=b&&a>=c)
     printf("%d",a);
    else{

      if(b>=c)
       printf("%d",b);
	   else
		  printf("%d",c);
    }
    getch();
}
*/
/*
#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter Three No.=");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b)
	{
		if(a>c)
    	printf("%d",a);
    	else
    	printf("c");
	 }
    else
	{

      if(b>c)
       printf("%d",b);
	   else
		  printf("%d",c);
    }
    getch();    
}*/

/*
#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter Three No.=");
    scanf("%d%d%d",&a,&b,&c);
    (a>b)?(a>c)?printf("%d",a):printf("c"): (b>c)?printf("%d",b):printf("%d",c);
    getch();    
}
*/
#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter Three No.=");
    scanf("%d%d%d",&a,&b,&c);
      printf("%d",a>b?a>c?a:c:b>c?b:c);
    getch();    
}
