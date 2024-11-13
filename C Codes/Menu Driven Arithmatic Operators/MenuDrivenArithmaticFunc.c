#include<stdio.h>
#include<conio.h>
int addNum(int,int); 
int subNum(int,int);
float mulNum(float,float);
float divNum(float,float);
int sqNo(long);       
int cubeNo(long);  
long fact(long);                 //Function Prototype
void main()                      //Function main
{
	int result1 , result2, result3;
	int a, b; 
	int result5, result6, result7; 
	float result4;
	char OPT , loop;
	do
	{
	printf("-------Select what do you want to perform-------\n");
	printf("1 :- Addition\n");
	printf("2 :- Substraction\n");
	printf("3 :- Multiplication\n");
	printf("4 :- Division\n");
	printf("5 :- Square of a Number\n");
	printf("6 :- Cube of a Number\n");
	printf("7 :- Factorial of a Number\n");
	printf("------------------------------------------------\n");
	scanf("%d", &OPT);
	printf("------------------------------------------------\n"); 
	switch(OPT)
	{
		case 1 :  result1 = addNum(a, b);
		break;
		
		case 2 :  result2 = subNum(a, b);
		break;
		
		case 3 :  result3 = mulNum(a, b);
		break;
		
		case 4 :  result4 = divNum(a, b);
		break;
		
		case 5 :  result5 = sqNo(a);
		break;  
		
		case 6 :  result6 = cubeNo(a);
		break;
		
		case 7 :  result7 = fact(a);
		break;
    }
	printf("-----------------------\nMain Menu : Enter 1\n");
	printf("Exit : Enter any Key\n-----------------------\n");
	scanf("%d", &loop);
}while (loop == 1);
return;
}

int addNum(int x, int y)       //Function Definition
{
	int c;
	printf("Enter 2 numbers\n");
	scanf("%d %d", &x , &y);
	c = x + y;
	printf("Addition of %d + %d = %d\n", x,y,c);
	return 0;
}

int subNum(int x, int y)       //Function Definition
{
	int d;
	printf("Enter 2 numbers\n");
	scanf("%d %d", &x , &y);
	d = x - y;
	printf("Substraction of %d - %d = %d\n", x,y,d);
	return 0;
}

float mulNum(float x, float y)       //Function Definition
{
	float e;
	printf("Enter 2 numbers\n");
	scanf("%f %f", &x , &y);
	e = x * y;
	printf("Multiplication of %.2f * %.2f = %.4f\n", x,y,e);
	return 0;
}

float divNum(float x, float y)       //Function Definition
{
	float f;
	printf("Enter 2 numbers\n");
	scanf("%f %f", &x , &y);
	f = x / y;
	printf("Division of %.2f / %.2f = %.2f\n", x,y,f);
	return 0;
}

int sqNo(long x)
{
	printf("Enter number\n");
	scanf("%d", &x);
	int g = x * x;
	printf("Square Of %d : %d\n", x , g);
	return 0;
}

int cubeNo(long x)
{
	printf("Enter number\n");
	scanf("%d", &x);
	int h = x * x * x;
	printf("Square Of %d : %d\n", x , h);
	return 0;
}

long fact(long x) 
{
    printf("Enter number:\n");
    scanf("%d", &x);
    
    long factorial = 1;     
    for (long i = 1; i <= x; i++)
	{
        factorial *= i; 
    }
    printf("Factorial of %d: %d\n", x, factorial);
    return factorial; 
}
