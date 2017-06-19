#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct node{
int data;
struct node *next;
};
int main(){
int num,i=0;
int count=0;
char choice[10];
printf("Enter the list\n");
struct node *head=NULL;
struct node *newNode=(struct node*)malloc(sizeof(struct node));
struct node *temp;
do{
struct node *newNode=(struct node*)malloc(sizeof(struct node));
scanf("%d",&num);
newNode->data=num;
newNode->next=NULL;
if(head==NULL)
{
head=newNode;
}
else{
        temp=head;
while(temp->next!=NULL){
temp=temp->next;
}
temp->next=newNode;
}
printf("Enter y to continue\n");
scanf("%s",choice);
count++;
}while((strcmp(choice,"y")==0));
i=0;
while(i<count/2){
    head=head->next;
    i++;

}
printf("%d",head->data);
return 0;
}




