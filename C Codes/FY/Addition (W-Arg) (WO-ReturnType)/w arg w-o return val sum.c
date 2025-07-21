#include<stdio.h>
int addNumber(int a, int b);
int main()
{
	int n1, n2, sum;
	printf("Enter 2 Numbers\n");
	scanf("%d%d", &n1, &n2);
	
	sum=addNumber(n1,n2);
	printf("sum = %d", sum);	
	return 0;
}

int addNumber(int a, int b)
{
	int result;
	result = a+b;
	return result;
}