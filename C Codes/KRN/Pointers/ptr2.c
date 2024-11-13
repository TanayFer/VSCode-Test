#include <stdio.h>
int main() 
{
int y = 99; 
int *ptr = &y; 
printf("Value pointed to by ptr: %d\n", *ptr);
return 0;
}