#include <stdio.h>
#include <math.h>

int main() 
{
    int number, original, remainder, result = 0, n = 0;
    printf("Enter an integer: ");
    scanf("%d", &number);
    original = number; 
    while (original != 0) 
	{
        original /= 10;
        n++;
    }
    original = number; 
    while (original != 0) 
	{
        remainder = original % 10;
        result += pow(remainder, n);
        original /= 10;
    }
    if (result == number) 
	{
        printf("%d is an Armstrong number.\n", number);
    } 
	else 
	{
        printf("%d is not an Armstrong number.\n", number);
    }
    return 0;
}
