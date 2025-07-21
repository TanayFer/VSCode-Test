#include <stdio.h>

int main() {
    int i = 1; // Row counter

    // Outer loop for rows
    while (i <= 5) {
        int j = 1; // Column counter

        // Inner loop for printing asterisks in each row
        while (j <= i) {
            printf("* ");
            j++; // Increment column counter
        }

        printf("\n"); // New line after each row
        i++; // Increment row counter
    }

    return;
}