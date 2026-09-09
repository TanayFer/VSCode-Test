#include <stdio.h>
#include <math.h>
int main() 
{
    int number;
    double squareRoot;
    printf("Enter a number: ");
    scanf("%d", &number);
    squareRoot = sqrt((double)number);
    if (squareRoot == (int)squareRoot) 
	{
        printf("%d is a perfect square.\n", number);
    } 
	else 
	{
        printf("%d is not a perfect square.\n", number);
    }
    return 0;
}
