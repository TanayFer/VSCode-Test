#include <stdio.h>
int swap(int *a, int *b);
int main() {
    int a, b;
    printf("Enter 2 values\n");
    scanf("%d %d", &a, &b);
    printf("Before Swap: A: %d, B: %d\n", a, b);
    swap(&a, &b);
    printf("After Swap: A: %d, B: %d\n", a, b);
    return 0;
}
int swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}