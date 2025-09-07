#include<stdio.h>
int main() 
{
int k=5, *kptr, ptr;
ptr = &k;
printf("Direct Access k = %d \n", k);
printf("Indirect Access k=%d \n", *kptr);
return 0; 
}