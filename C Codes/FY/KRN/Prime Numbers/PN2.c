//C program to check whether a number is prime or not
//using function with return and argument
#include <stdio.h>
int prime(int num); //function prototype declaration
int main() 
{
int n;
printf ("Enter a number n ");
scanf ("%d",&n);
if (prime(n)==0) //function call
printf ("The number is NOT PRIME");
else
printf ("The number is PRIME");
return 0;
}

int prime(int num)
{
int i;
for (i=2; i<=num-1; i++)
{
if(num%i==0)
return 0;
}
return 1;
}