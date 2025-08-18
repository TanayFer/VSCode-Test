#include <stdio.h>
void binarySearch(int arr[], int no, int key) {
    int bottom = 0;
    int top = no - 1;
    int mid;
    int found = 0;

    while (bottom <= top) {
        mid = bottom + (top - bottom) / 2;

        if (arr[mid] == key) {
            printf("Element found at position %d.\n", mid+1);
            found = 1;
            break;
        } else if (arr[mid] < key) {
            bottom = mid + 1;
        } else {
            top = mid - 1;
        }
    }

    if (found == 0) {
        printf("Element not found in the array.\n");
    }
}

int main() {
    int arr[100];
    int no, i;
    int key;

    printf("Enter the number of elements in the array (max 100): ");
    scanf("%d", &no);

    if (no > 100 || no <= 0) {
        printf("Invalid no.\n");
        return 1;
    }

    printf("Enter %d integers in sorted (ascending) order:\n", no);
    for (i = 0; i < no; i++) {
        scanf("%d", &arr[i]);
    }

    printf("\nEnter the element to search for: ");
    scanf("%d", &key);

    binarySearch(arr, no, key);

    return 0;
}