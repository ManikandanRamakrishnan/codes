#include<stdio.h>
void main()
{
int number,i,sum=0;
printf("Enter the number:");
scanf("%d",&number);
for(i=1;i<=number;i++)
sum+=i;
printf("SUM=%d",sum);
}
