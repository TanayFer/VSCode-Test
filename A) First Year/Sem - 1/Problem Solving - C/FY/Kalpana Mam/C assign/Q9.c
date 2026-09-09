#include <stdio.h>
int computeGCD(int a, int b) 
{
    int remainder;
    while (b != 0) 
	{
        remainder = a % b;
        printf("%d %% %d = %d\n", a, b, remainder);
        a = b;
        b = remainder;
    }
    return a;
}
int main() 
{
    int num1, num2, gcd;
    printf("Enter first number: ");
    scanf("%d", &num1);
    printf("Enter second number: ");
    scanf("%d", &num2);
    gcd = computeGCD(num1, num2);
    printf("GCD of %d and %d is %d\n", num1, num2, gcd);
    return 0;
}
