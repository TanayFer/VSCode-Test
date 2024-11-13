#include <stdio.h>
int main() {
int numbers[] = {10, 20, 30, 40, 50};
int *ptr = numbers;
printf("Array elements using pointer:\n");
for (int i = 0; i < 5; i++) 
{
printf("Element %d: %d\n", i + 1, *(ptr + i));
}
*(ptr + 2) = 300;
printf("\nModified array elements:\n");
for (int i = 0; i < 5; i++) 
{
printf("Element %d: %d\n", i + 1, numbers[i]);
}
return 0; }