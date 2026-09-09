#include <stdio.h>

int main() {
    int number, factorial = 1;

    printf("Enter a number: ");
    scanf("%d", &number);
    printf("Output: ");
    for (int i = 1; i <= number; i++)
	{
        factorial *= i;
        if (i < number) 
		{
            printf("%d * ", i);  
        } 
		else 
		{
            printf("%d = ", i);
        }
    }
    printf("%d\n", factorial);
    return 0;
}
