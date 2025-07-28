#include <stdio.h>
#define MAX_SIZE 100 

void traverse(int arr[], int size) {
    if (size == 0) {
        printf("Array is empty.\n");
        return;
    }
    printf("Array elements are: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
};

int insertElement(int arr[], int* size, int element, int position) {

    if (*size >= MAX_SIZE) {
        printf("Error: Array is full. Cannot insert.\n");
        return *size;
    }

    if (position < 0 || position > *size) {
        printf("Error: Invalid position for insertion.\n");
        return *size;
    }


    for (int i = *size - 1; i >= position; i--) {
        arr[i + 1] = arr[i];
    }

  
    arr[position] = element;

    
    (*size)++;

    printf("Element %d inserted successfully at position %d.\n", element, position);
    return *size;
};


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
};

int main() {
    int arr[MAX_SIZE];
    int size = 0; 
    int choice, element, position;

    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;
    size = 5;

    while (1) {
        printf("\n--- Array Operations Menu ---\n");
        printf("1. Insert Element\n");
        printf("2. Delete Element\n");
        printf("3. Traverse Array\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the element to insert: ");
                scanf("%d", &element);
                printf("Enter the position (0 to %d) to insert at: ", size);
                scanf("%d", &position);
                insertElement(arr, &size, element, position);
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