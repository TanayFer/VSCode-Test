#include<stdio.h>

int main() {
    int no, isPrime;

    printf("Enter a number: ");
    scanf("%d", &no);
    printf("Prime numbers between 1 and %d are:\n", no);
    
    for (int i = 2; i <= no; i++) {
        isPrime = 1;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                isPrime = 0;
                break;
            }
        }
        if (isPrime)	{
       	    printf("%d\t", i);
		}
    }
    return 0;
}