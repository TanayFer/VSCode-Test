#include <stdio.h>
int main() {
    int ary[10];             
    int *pary = ary;       

    printf("Enter 10 elements:\n");
    for(int i = 0; i < 10; i++) {
        scanf("%d", (pary+i));
    }
    printf("\nReverse:\n");
    for(int i = 9; i >= 0; i--) {
        printf("%d ", *(pary+i));  
    }
    
    return 0;
}