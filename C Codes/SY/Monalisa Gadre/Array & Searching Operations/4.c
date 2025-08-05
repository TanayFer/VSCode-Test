#include <stdio.h>
void mergeary(int ary1[], int size1, int ary2[], int size2, int result[]) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < size1) {
        result[k] = ary1[i];
        i++;
        k++;
    }

    while (j < size2) {
        result[k] = ary2[j];
        j++;
        k++;
    }
}

int main() {
    int ary1[100], ary2[100], result[200];
    int size1, size2, i;

    printf("Enter the number of elements for the first aryay (max 100): ");
    scanf("%d", &size1);
    printf("Enter %d integers in sorted order for the first aryay:\n", size1);
    for (i = 0; i < size1; i++) {
        scanf("%d", &ary1[i]);
    }

    printf("\nEnter the number of elements for the second aryay (max 100): ");
    scanf("%d", &size2);
    printf("Enter %d integers in sorted order for the second aryay:\n", size2);
    for (i = 0; i < size2; i++) {
        scanf("%d", &ary2[i]);
    }

    mergeary(ary1, size1, ary2, size2, result);

    printf("\nThe merged sorted aryay is:\n");
    for (i = 0; i < size1 + size2; i++) {
        printf("%d ", result[i]);
    }
    printf("\n");

    return 0;
}
