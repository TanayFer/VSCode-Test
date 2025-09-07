#include<stdio.h>
void factorial();
void main()
{
	factorial();
}
void factorial()
{
	int i, fact=1, num;
	printf("Enter a number\n");
	scanf("%d", &num);
	for(i=1;i<=num;i++)
	{
		fact *= i;
	}
	printf("Factorial of %d is : %d", num, fact);
return;
}