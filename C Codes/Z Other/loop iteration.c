//C code to display a Pattern
#include<stdio.h>
int main() 
{
int i = 1, j =1;
while (i <= 3)
{
printf("Outer loop iteration %d\n",i);
while (j <= 3)
{
printf(" Inner loop iteration %d\n", j);
j++;
}
i++;
j = 1; // reset j to 1 for the next iteration of the outer loop
}
return 0;
}