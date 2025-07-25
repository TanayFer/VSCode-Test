#include<stdio.h>
int main()
{
	long no;
	printf("Enter Number\n");
	scanf("%d", &no);
	for(long i=0; i<no; i++)
	{
		printf("%d", i+1);
		printf("\t");
	}
	return 0;
}