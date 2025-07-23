#include<stdio.h>
int Prime();
int main()  {
    int opt;
    printf("---------Program using Functions----------\n");
    printf("Prime :- 1");
    scanf("%d", &opt);
    
}

int Prime() {
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
}