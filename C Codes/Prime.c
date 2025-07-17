#include <stdio.h>

int main() {
    int no, i, isPrime = 1;

    printf("Enter a number (To check if it's prime or not): ");
    scanf("%d", &no);
    if (no <= 1) {
        isPrime = 0;
    } else {
        for (i = 2; i <= no / 2; i++) {
            if (no % i == 0) {
                isPrime = 0;
            }
        }
    }
    if (isPrime) {
        printf("Number is prime\n");
    } else {
        printf("Number is not prime\n");
    }

    return 0;
}