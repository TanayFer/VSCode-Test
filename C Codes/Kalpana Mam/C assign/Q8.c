#include <stdio.h>

int main() 
{
    int number, i;

    printf("Enter a number: ");
    scanf("%d", &number);

    int original = number;  
    printf("%d = ", number);
    for (i = 2; i <= number; i++) 
	{
        while (number % i == 0) 
		{
            printf("%d", i);
            number = number / i;
            if (number > 1) 
			{
                printf(" * ");
            }
        }
    }
    printf("\n");
    return 0;
}
