#include <stdio.h>
#include <string.h>

int main() {
    char str[100], rev[100];
    int len, i, j;

    printf("Enter a string/number to check if it's a palindrome: ");
    scanf("%s", str);

    len = strlen(str);

    for (i = len - 1, j = 0; i >= 0; i--, j++) {
        rev[j] = str[i];
    }

    if (strcmp(str, rev) == 0) {
        printf("It's a Palindrome!\n");
    } else {
        printf("Not a Palindrome.\n");
    }

    return 0;
}