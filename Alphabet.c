#include<stdio.h>
void main()
{
char ch;
ch=getchar();
if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
printf("ALPHABET");
else
printf("Not An Alphabet");
}
