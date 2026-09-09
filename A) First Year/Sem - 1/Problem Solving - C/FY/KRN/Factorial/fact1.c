//For loop (Factorial)
#include <stdio.h>
int main(void) 
{
int n;
int fact = 1; 
printf("Enter Number : ");
scanf("%d",&n);
for(int i = 1; i <= n; i ++)
{
fact = fact*i;
}
printf("Factorial of %d is : %d", n, fact);
return 0;
}