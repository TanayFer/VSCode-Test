//C code for 
#include<stdio.h>
int main()	{
	int no, digit[101];
	printf("Enter a number: ");
	scanf("%d", &no);
	for(int i=0; i<1; i++)	{
		digit[i] = no % 2;
		no = no/2;
		printf("%d", no);
	}
	
}