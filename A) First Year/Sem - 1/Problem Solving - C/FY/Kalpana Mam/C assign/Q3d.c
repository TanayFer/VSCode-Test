#include <stdio.h>

int main() {
    int number, reversed = 0, original, remainder;

    printf("Enter an integer: ");
    scanf("%d", &number);

    original = number;
    while (number != 0) 
	{
        remainder = number % 10;           
        reversed = reversed * 10 + remainder; 
        number = number / 10;              
    }
    if (original == reversed) 
	{
        printf("%d is a palindrome.\n", original);
    }
    else 
	{
        printf("%d is not a palindrome.\n", original);
    }

    return 0;
}
