#include<stdio.h>
int main()
{
	char k;
	int num;
	printf("Enter Character : ");
	scanf(" %c", &k);
	printf("Enter Number of time to be printed : ");
	scanf("%d", &num);
	for(int i=1; i<=num; i++)
	{
		printf("%c", k);
	}
	return 0;
}