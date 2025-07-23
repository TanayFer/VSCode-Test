#include <stdio.h>
#include <string.h>

int main() {
    int opt;
    char anish[100], ashish[100];
    printf("-----String Operation Menu-----------\n");
    printf("Length :- 1\n");
    printf("Copy :- 2\n");
    printf("Compare :- 3\n");
    printf("Enter your choice: ");
    scanf("%d", &opt);
    getchar();

    switch(opt) {
        case 1: {
            printf("Enter a String: ");
            fgets(anish, sizeof(anish), stdin);
            anish[strcspn(anish, "\n")] = 0; 
            int count = 0;
            for(int i = 0; anish[i] != '\0'; i++) {
                count++;
            }
            printf("Length of string: %d\n", count);
            break;
        }
        case 2: {
            printf("Enter a String: ");
            fgets(anish, sizeof(anish), stdin);
            anish[strcspn(anish, "\n")] = 0;
            strcpy(ashish, anish);
            printf("Copied string is: %s\n", ashish);
            break;
        }
        case 3: {
            printf("Enter first string: ");
            gets(anish);
            printf("Enter second string to compare: ");
            gets(ashish);
            int cmp = strcmp(anish, ashish);
            if(cmp == 0)
                printf("Strings are equal.\n");
            else if(cmp < 0)
                printf("Second string is Greater\n");
            else
                printf("First string is Greater\n");
            break;
        }
        default:
            printf("Invalid option!\n");
            break;
    }
    return 0;
}