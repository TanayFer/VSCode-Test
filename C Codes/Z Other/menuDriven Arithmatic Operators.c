#include<stdio.h>
void main()
{
	int num1, num2, opt;
	printf("Enter the First Number\n");
	scanf("%d",&num1);
	printf("Enter Second Number\n");
	scanf("%d",&num2);
	//
	printf("----------Enter Your Operation Choice----------\n");
	printf("1 - Addition\n");
	printf("2 - Substraction\n");
	printf("3 - Multiplication\n");
	printf("4 - Division\n");
	printf("5 - Exit\n");
	scanf("%d",&opt);
	//
	switch(opt)
	{
		case 1: printf("Addition : %d + %d = %d\n", num1, num2, num1+num2);
		break;
			case 2: printf("Substraction : %d - %d = %d\n", num1, num2, num1-num2);
		break;
			case 3: printf("Multiplication : %d * %d = %d\n", num1, num2, num1*num2);
		break;
			case 4: printf("Division : %d / %d = %d\n", num1, num2, num1/num2);
		break;
			case 5: break;
			
		default : printf("Error 404 - Fuck Off");
		break;
	}
	return;
}
	
	
	
	
	
	
	
	
	
	
	
	