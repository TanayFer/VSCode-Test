#include<stdio.h>

int main()
{
    int no, i = 1;
    printf("Enter Number: ");
    scanf("%d", &no);
    
    do
    {
    	printf("%d * %d = %d\n", no, i, no*i);
    	i++;
	}while(i<=10);
    return 0;
}
