#include<stdio.h>
void main()
{
int sum=0,number;
printf("Enter the number:");
scanf("%d",&number);
while(number>0)
{
sum+=number;
number--;
}
printf("SUM=%d",sum);
}
