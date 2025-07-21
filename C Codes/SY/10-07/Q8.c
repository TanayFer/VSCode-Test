#include <stdio.h>
int main() {
    int no, ary[100], tot = 0;

    printf("Enter no. of integers you want to insert: ");
    scanf("%d", &no);

    for (int i = 0; i < no; i++) {
        printf("Enter integer %d: ", i + 1);
        scanf("%d", &ary[i]);
    }
    for (int i = 0; i < no; i++) {
        tot += ary[i];
    }

    printf("Total Sum = %d\n", tot);
    return 0;
}