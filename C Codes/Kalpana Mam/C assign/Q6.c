#include <stdio.h>

int main() 
{
    int number;

    printf("Enter a number: ");
    scanf("%d", &number);
    printf("All factors excluding the number itself: ");
    for (int i = 1; i < number; i++) 
	{
        if (number % i == 0) 
		{
            printf("%d ", i); 
        }
    }

    printf("\n");
    return 0;
}
