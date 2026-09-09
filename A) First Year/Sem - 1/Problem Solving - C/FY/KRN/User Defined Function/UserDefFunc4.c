//factorial program of function with argument and no returning value.
#include <stdio.h>
void factorial(int fact);
void main() 
{
int fact=1;
factorial(fact);
}

void factorial(int fact)
{
int i,num;
printf("Enter a number: ");
scanf("%d",&num);
for(i=1;i<=num;i++)
{
fact=fact*i; 
}
printf("Factorial of a number %d is: %d",num,fact);
}