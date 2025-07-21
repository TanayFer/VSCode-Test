#include<stdio.h>
int main()	{
	int *a, *b, c, d;
	a=&c;
	b=&d;
	printf("Enter 2 Integers\n");
	scanf("%d %d", &c, &d);
	if(*a > *b)	{
		printf("Max: %d", *a);
	}else{
		printf("Max: %d", *b);
	}
	return 0;
}