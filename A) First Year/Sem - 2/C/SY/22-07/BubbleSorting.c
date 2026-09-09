//C code for Bubble Sorting
#include<stdio.h>
int main() {
    int ary[100], no, temp;
    printf("How many elements you want to enter: ");
    scanf("%d", &no);
    for(int i=0; i<no; i++) {
        scanf("%d", &ary[i]);
    }
    printf("Original Array:\n");
    for(int i=0; i<no; i++) {
        printf("%d\t", ary[i]);
    }
    // Bubble sort
    for(int i=0; i<no-1; i++) {
        for(int j=0; j<no-1-i; j++) {
            if(ary[j] > ary[j+1]) {
                int temp = ary[j];
                ary[j] = ary[j+1];
                ary[j+1] = temp;
            }
        }
    }
    // Print O/P
    printf("\nSorted Array:\n");
    for(int i=0; i<no; i++) {
        printf("%d\t", ary[i]);
    }
    return 0;
}