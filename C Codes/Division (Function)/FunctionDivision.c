#include<stdio.h>
#include<conio.h>
int divNum(int,int);             //Function Prototype
void main()                      //Function main
{
	int a, b;
	printf("Enter 2 numbers for Division\n");
	scanf("%d %d", &a , &b);
	int result = divNum(a, b);  //Function Call
	getch();
}
int divNum(int x, int y)       //Function Definition
{
	int c;
	c = x / y;
	printf("Division of %d / %d = %d", x,y,c);
	return 0;
}
