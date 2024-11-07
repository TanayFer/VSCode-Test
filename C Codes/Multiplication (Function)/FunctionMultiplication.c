#include<stdio.h>
#include<conio.h>
int mulNum(int,int);             //Function Prototype
void main()                      //Function main
{
	int a, b;
	printf("Enter 2 numbers for Multiplication\n");
	scanf("%d %d", &a , &b);
	int result = mulNum(a, b);  //Function Call
	getch();
}
int mulNum(int x, int y)       //Function Definition
{
	int c;
	c = x * y;
	printf("Multiplication of %d + %d = %d", x,y,c);
	return 0;
}
