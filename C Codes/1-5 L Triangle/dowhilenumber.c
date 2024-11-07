#include <stdio.h>

int main() {
    int i = 1; // Row counter

    // Outer do-while loop for rows
    do {
        int j = 1; // Column counter

        // Inner do-while loop for printing numbers in each row
        do {
            printf("%d ", j);
            j++; // Increment column counter
        } while (j <= i); // Condition for inner loop

        printf("\n"); // New line after each row
        i++; // Increment row counter
    } while (i <= 5); // Condition for outer loop

    return 0;
}