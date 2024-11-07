#include<stdio.h>
#include<conio.h>
int addNum(int,int); 
int subNum(int,int);
int mulNum(int,int);
float divNum(float,float);             //Function Prototype
void main()                      //Function main
{
	int a, b;
	printf("Enter 2 numbers\n");
	scanf("%d %d", &a , &b);
	int result1 = addNum(a, b);
	int result2 = subNum(a, b);
	int result3 = mulNum(a, b);
	float result4 = divNum(a, b);  //Function Call
	getch();
}
int addNum(int x, int y)       //Function Definition
{
	int c;
	c = x + y;
	printf("Addition of %d + %d = %d\n", x,y,c);
	return 0;
}
int subNum(int x, int y)       //Function Definition
{
	int d;
	d = x - y;
	printf("Substraction of %d - %d = %d\n", x,y,d);
	return 0;
}
int mulNum(int x, int y)       //Function Definition
{
	int e;
	e = x * y;
	printf("Multiplication of %d * %d = %d\n", x,y,e);
	return 0;
}
float divNum(float x, float y)       //Function Definition
{
	float f;
	f = x / y;
	printf("Division of %.2f / %.2f = %.2f\n", x,y,f);
	return 0;
}
