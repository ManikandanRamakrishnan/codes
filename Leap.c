#include<stdio.h>
void main()
{
int year;
printf("Enter the Year:");
scanf("%d",&year);
if(year%400==0||(year%4==0&&year%100!=0))
printf("LEAP YEAR");
else
printf("NOT A LEAP YEAR");
}
