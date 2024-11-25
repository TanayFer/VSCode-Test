#include <stdio.h>

int main() 
{
    int number, factorial = 1;

    printf("Enter a number: ");
    scanf("%d", &number);

    printf("Output: ");
    for (int i = number; i >= 1; i--) 
	{
        factorial *= i;
        if (i > 1) 
		{
            printf("%d * ", i);  // Print the number followed by " * "
        } 
		else 
		{
            printf("%d = ", i);  // Print the last number followed by " = "
        }
    }

    // Print the factorial result
    printf("%d\n", factorial);

    return 0;
}
