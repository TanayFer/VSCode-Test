//While Loop (Factorial)
#include <stdio.h>
int main(void) 
{
int n;
int fact = 1; 
printf("Enter Number: ");
scanf("%d", &n);
int i = 1;
while(i <= n)
{
fact = fact*i;
i++;
}
printf("Factorial of %d is : %d", n, fact);
return 0;
}