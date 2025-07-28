#include <stdio.h>

void mergeArrays(int arr1[], int size1, int arr2[], int size2, int result[]) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < size1 && j < size2) {
        if (arr1[i] <= arr2[j]) {
            result[k] = arr1[i];
            i++;
        } else {
            result[k] = arr2[j];
            j++;
        }
        k++;
    }

    while (i < size1) {
        result[k] = arr1[i];
        i++;
        k++;
    }

    while (j < size2) {
        result[k] = arr2[j];
        j++;
        k++;
    }
}

int main() {
    int arr1[100], arr2[100], result[200];
    int size1, size2, i;

    printf("Enter the number of elements for the first array (max 100): ");
    scanf("%d", &size1);
    printf("Enter %d integers in sorted order for the first array:\n", size1);
    for (i = 0; i < size1; i++) {
        scanf("%d", &arr1[i]);
    }

    printf("\nEnter the number of elements for the second array (max 100): ");
    scanf("%d", &size2);
    printf("Enter %d integers in sorted order for the second array:\n", size2);
    for (i = 0; i < size2; i++) {
        scanf("%d", &arr2[i]);
    }

    mergeArrays(arr1, size1, arr2, size2, result);

    printf("\nThe merged sorted array is:\n");
    for (i = 0; i < size1 + size2; i++) {
        printf("%d ", result[i]);
    }
    printf("\n");

    return 0;
}
