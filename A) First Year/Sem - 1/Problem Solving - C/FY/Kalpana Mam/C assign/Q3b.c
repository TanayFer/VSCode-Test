#include <stdio.h>
int main() {
    int number, digit1 = 0, digit2 = 0, digit3 = 0, digit4 = 0;
    int count = 0; 

    printf("Enter a 4-digit integer: ");
    scanf("%d", &number);

    while (number != 0) 
	{
        int digit = number % 10; 
        number = number / 10;
        count++;
        switch (count) 
		{
            case 1:
                digit1 = digit;
                break;
            case 2:
                digit2 = digit;
                break;
            case 3:
                digit3 = digit;
                break;
            case 4:
                digit4 = digit;
                break;
            default:
                printf("Number exceeds 5 digits\n");
                return 1;
        }
    }

    printf("Digits are: %d + %d + %d + %d = %d\n",digit4, digit3, digit2, digit1, digit1+digit2+digit3+digit4);

    return 0;
}
