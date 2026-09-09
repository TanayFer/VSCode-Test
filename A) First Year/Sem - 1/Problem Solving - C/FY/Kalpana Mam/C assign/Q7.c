#include <stdio.h>

int main() 
{
    int number;

    printf("Enter a number: ");
    scanf("%d", &number);
    printf("Unique pairs of numbers whose multiplication equals %d:\n", number);

    for (int i = 1; i <= number / 2; i++) 
	{
        if (number % i == 0) 
		{
            int pair = number / i;
            printf("%d * %d = %d\n", i, pair, number);
        }
    }
    return 0;
}
