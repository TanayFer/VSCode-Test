//C code for Armstrong Number
#include <stdio.h>
#include <math.h>

int main() {
    int num, original, rem, n = 0;
    int result = 0;
    printf("Enter a number: ");
    scanf("%d", &num);
    original = num;
    while (original != 0) {
        original /= 10;
        n++;
    }
    original = num;
    while (original != 0) {
        rem = original % 10;
        result += pow(rem, n);
        original /= 10;
    }
    if (result == num)
        printf("%d is an Armstrong number.\n", num);
    else
        printf("%d is not an Armstrong number.\n", num);
    return 0;
}
