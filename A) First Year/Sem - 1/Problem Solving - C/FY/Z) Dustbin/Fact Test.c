#include<stdio.h>
void main()
{
   factorial();
}
void factorial()
{
    int fact=1 , i, num;
    printf("Enter a Number : ");
    scanf("%d",&num);
    for ( i = 1; i <= num; i++)
    {
        fact *= i;
    }
    printf("Factorial of %d : %d", num, fact);
    return;
}