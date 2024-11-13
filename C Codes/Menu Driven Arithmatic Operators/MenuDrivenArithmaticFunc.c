#include<stdio.h>
#include<conio.h>
int addNum(int,int); 
int subNum(int,int);
int multNum(int,int);
float mulNum(float,float);
int diviNum(int ,int);
float divNum(float,float);
int sqNo(long);       
int cubeNo(long);  
long fact(long);      
int power(int , int);            //Function Prototype
void main()                      //Function main
{
	int result1 , result2, result3;
	int a, b; 
	int result5, result6, result7, result8, result9, result10; 
	float result4;
	char OPT , loop;
	do
	{
	printf("-------Select what do you want to perform-------\n");
	printf("1 :- Addition\n");
	printf("2 :- Substraction\n");
	printf("3 :- Multiplication\n");
	printf("4 :- Multiplication in Decimal Value\n");
	printf("5 :- Division\n");
	printf("6 :- Division in Decimal Value\n");
	printf("7 :- Square of a Number\n");
	printf("8 :- Cube of a Number\n");
	printf("9 :- Factorial of a Number\n");
	printf("10 :- Power\n");

	printf("------------------------------------------------\n");
	scanf("%d", &OPT);
	printf("------------------------------------------------\n"); 
	switch(OPT)
	{
		case 1 :  result1 = addNum(a, b);
		break;
		
		case 2 :  result2 = subNum(a, b);
		break;
		
		case 3 :  result3 = multNum(a, b);
		break;

		case 4 :  result4 = mulNum(a, b);
		break;

		case 5 :  result5 = diviNum(a, b);
		break;
		
		case 6 :  result6 = divNum(a, b);
		break;
		
		case 7 :  result7 = sqNo(a);
		break;  
		
		case 8 :  result8 = cubeNo(a);
		break;
		
		case 9 :  result9 = fact(a);
		break;

		case 10 :  result10 = power(a,b);
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

int multNum(int x, int y)       //Function Definition
{
	int e;
	printf("Enter 2 numbers\n");
	scanf("%d %d", &x , &y);
	e = x * y;
	printf("Multiplication of %d * %d = %d\n", x,y,e);
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

int diviNum(int x, int y)       //Function Definition
{
	int f;
	printf("Enter 2 numbers\n");
	scanf("%d %d", &x , &y);
	f = x / y;
	printf("Division of %d / %d = %d\n", x,y,f);
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

int power(int a, int b)
{
	int p=1;
	printf("Enter The First Number\n");
	scanf("%d",&a);
	printf("Enter The Power\n");
	scanf("%d",&b);
	for(int i=1; i<=b; i++)
	{
		p *= a;
	}
	printf("Power Is %d\n", p);
	return 0;
}
