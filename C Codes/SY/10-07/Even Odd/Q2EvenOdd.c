#include<stdio.h>
int main()	{
	int *a, *b, c, d;
	a=&c;
	printf("Enter 1 Integers\n");
	scanf("%d", &c);
	if(*a % 2 == 0)	{
		printf("Number is Even");
	}else{
		printf("Number is Odd");
	}
	return 0;
}