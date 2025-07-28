#include <stdio.h>
#define MAX_SIZE 100

void traverse(int arr[], int size) {
    printf("Array elements are: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int deleteElement(int arr[], int* size, int position) {
    if (*size <= 0) {
        printf("Error: Array is empty. Cannot delete.\n");
        return *size;
    }
    if (position < 0 || position >= *size) {
        printf("Error: Invalid position for deletion.\n");
        return *size;
    }

    printf("Element %d deleted successfully from position %d.\n", arr[position], position);

    for (int i = position; i < *size - 1; i++) {
        arr[i] = arr[i + 1];
    }
    (*size)--;

    return *size;
}

int main() {
    int arr[MAX_SIZE], size = 0;
    int choice, no, position, temp;

    while (1) {
        printf("\n--- Array Operations Menu ---\n");
        printf("1. Insert Element(s)\n");
        printf("2. Delete Element\n");
        printf("3. Traverse Array\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                if (size >= MAX_SIZE) {
                    printf("Error: Array is full. Cannot insert.\n");
                } else {
                    printf("Enter number of elements to insert: ");
                    scanf("%d", &no);
                    if (size + no > MAX_SIZE) {
                        printf("Error: Not enough space to insert %d elements.\n", no);
                        break;
                    }
                    printf("Enter %d element(s): ", no);
                    for (int i = 0; i < no; i++) {
                        scanf("%d", &temp);
                        arr[size++] = temp;
                    }
                    printf("Elements inserted successfully.\n");
                }
                break;

            case 2:
                if (size > 0) {
                    printf("Enter the position (0 to %d) to delete from: ", size - 1);
                    scanf("%d", &position);
                    deleteElement(arr, &size, position);
                } else {
                    printf("Array is empty. Cannot delete.\n");
                }
                break;

            case 3:
                traverse(arr, size);
                break;

            case 4:
                printf("Exiting program.\n");
                return 0;

            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
    return 0;
}