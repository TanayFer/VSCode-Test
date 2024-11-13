#include <stdio.h>
int fact(int n)
{
return (n == 1 || n == 0) ? 1 : n * fact(n - 1);
}
int main(void) 
{
int n;
printf("Enter Number: ");
scanf("%d",&n);
int ans = fact(n);
printf("Factorial of %d is : %d", n, ans);
return 0;
}