#include <stdio.h>
int main()
{
	int a,b;
	int hack;
	printf("Enter 2 values\n");
	scanf("%d %d", &a, &b);
	printf("Enter 1 for Addition\n");
	printf("Enter 2 for Substraction\n");
	printf("Enter 3 for Multiplication\n");
	printf("Enter 4 for Division\n");
	scanf("%d" ,&hack);
	switch(hack)
	{
		case 1: 
	        printf("%d+%d=%d", a, b, a+b);
	        break;
	    case 2: 
	        printf("%d-%d=%d", a, b, a-b);
	        break;
	    case 3: 
	        printf("%d*%d=%d", a, b, a*b);
	        break;
	    case 4: 
	        printf("%d/%d=%d", a, b, a/b);
	        break;
	};
	return 0;
}