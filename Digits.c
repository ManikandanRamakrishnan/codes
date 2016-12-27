#include<stdio.h>
void main()
{
int number,mod,count=0;
printf("Enter the number:");
scanf("%d",&number);
while(number>0)
{
mod=number%10;
number/=10;
count++;
}
printf("NUMBER OF DIGITS=%d",count);
}
