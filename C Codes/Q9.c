#include <stdio.h>
int main() {
    char city[3][30];

    printf("Enter 3 city names:\n");

    for (int i = 0; i < 3; i++) {
        printf("City %d: ", i + 1);
        scanf("%s", city[i]); 
    }

    printf("\nYou entered:\n");
    for (int i = 0; i < 3; i++) {
        printf("%s\n", city[i]);  
    }

    return 0;
}