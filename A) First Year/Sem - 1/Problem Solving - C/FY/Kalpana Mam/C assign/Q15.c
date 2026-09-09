#include <stdio.h>
#include <stdbool.h>
bool isPrime(int number) 
{
    if (number <= 1) 
	{
        return false; 
    }
    for (int i = 2; i <= number / 2; i++) 
	{
        if (number % i == 0) 
		{
            return false; 
        }
    }
    return true;
}

int main() 
{
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);
    if (isPrime(number)) 
	{
        printf("%d is a prime number.\n", number);
    } 
	else 
	{
        printf("%d is not a prime number.\n", number);
    }

    return 0;
}
