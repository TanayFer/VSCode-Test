// Array of pointers
#include <stdio.h>
int main () 
{
int value_array[] = {42, 366, 458, 112};
int a, *point[4];
printf("Array of pointers!\n\n");
for (a = 0; a < 4; a++) 
{
point[a] = &value_array[a];
}
for (a= 0; a < 4; a++) 
{
printf("Value => var[%d]: %d\n", a, *point[a] );
}
return 0;
}
