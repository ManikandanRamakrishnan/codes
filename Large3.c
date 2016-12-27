#include<stdio.h>
void main()
{
int number1,number2,number3;
printf("Enter the three number:");
scanf("%d%d%d",&number1,&number2,&number3);
if(number1>number2&&number1>number3)
printf("Number1 is greater");
else if(number2>number3)
printf("Number2 is greater");
else
printf("Number3 is greater");
}
