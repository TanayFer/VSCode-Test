//c code of an addition program and understand the structure of a function.
#include <stdio.h>
void sum(); //function declaration
void main()
{
sum(); //function call
}
void sum() //function definition
{
int a, b, c;
printf("Enter First Number : ");
scanf("%d", &a);
printf("Enter Second Number : ");
scanf("%d", &b);
c=a+b;
printf("Addition of %d and %d is: %d",a,b,c);
}