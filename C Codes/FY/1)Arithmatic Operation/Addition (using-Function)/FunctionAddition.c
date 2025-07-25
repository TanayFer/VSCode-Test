#include<stdio.h>
#include<conio.h>
int addNum(int,int);             //Function Prototype
void main()                      //Function main
{
	int a, b;
	printf("Enter 2 numbers for Addition\n");
	scanf("%d %d", &a , &b);
	int result = addNum(a, b);  //Function Call
	getch();
}
int addNum(int x, int y)       //Function Definition
{
	int c;
	c = x + y;
	printf("Addition of %d + %d = %d", x,y,c);
	return 0;
}
