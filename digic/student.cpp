//wap in c to input student name and roll number and print student name and roll number.
#include"stdio.h"
#include"conio.h"
main(){
	char stname[25];
	int rollnumber;

	printf("Enter Student name=");
	scanf("%s",&stname);
	printf("Enter Student roll number=");
	scanf("%d",&rollnumber);
	printf("Student name is=%s",stname);
	printf("\n Student roll number is =%d",rollnumber);

}