#include<stdio.h>
void main()
{
int number;
printf("Enter the number:");
scanf("%d",&number);
if(number==0)
printf("ZERO");
else if(number>0)
printf("POSITIVE");
else
printf("NEGATIVE");
}
