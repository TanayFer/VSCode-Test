#include <stdio.h>

void linearSearch(int arr[], int size, int key) {
    int i;
    int comparisons = 0;
    int found = 0;

    for (i = 0; i < size; i++) {
        comparisons++;
        if (arr[i] == key) {
            printf("Element found at position %d.\n", i+1);
            found = 1;
            break;
        }
    }

    if (found == 0) {
        printf("Element not found in the array.\n");
    }

    printf("Total comparisons made: %d\n", comparisons);
}

int main() {
    int arr[100], no;
    int key;

	printf("Enter how many elements you want to insert: ");
	scanf("%d", &no);
	printf("Enter %d elements\n",no);
	for(int i=0; i<no; i++)	{
		scanf("%d",&arr[i]);
	}
	
    printf("Array elements are: ");
    for (int i = 0; i < no; i++) {
        printf("%d\t", arr[i]);
    }
    printf("\n");

    printf("Enter the element to search for: ");
    scanf("%d", &key);

    linearSearch(arr, no, key);

    return 0;
}
