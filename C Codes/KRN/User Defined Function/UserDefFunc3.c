// c code using user define function to compute factorial
#include<stdio.h>
void factorial();
void main() 
{
factorial();
}
void factorial()
{
int i,fact=1,num;
printf("Enter a number: ");
scanf("%d",&num);
for(i=1;i<=num;i++)
{
fact=fact*i;
}
printf("Factorial of a number %d is: %d",num,fact);
}