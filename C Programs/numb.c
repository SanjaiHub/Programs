//wap to print graetest number among 3 given numbers
#include<stdio.h>
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
}