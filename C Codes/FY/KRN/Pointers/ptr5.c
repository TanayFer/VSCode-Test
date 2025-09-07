// pointer to pointer
#include <stdio.h>
int main () 
{
int var, *ptr1, **ptr2;
var = 14;
ptr1 = &var;
ptr2 = &ptr1;
printf("Value of var = %d\n", var );
printf("Value available at *ptr1 = %d\n", *ptr1 );
printf("Value available at **ptr2 = %d\n", **ptr2);
return 0; 
}