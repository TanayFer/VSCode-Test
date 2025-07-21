#include<stdio.h>
#include<conio.h>
int subNum(int,int);
void main()
{
	int a, b;
	printf("Enter 2 numbers for Addition\n");
	scanf("%d %d", &a , &b);
	int result = subNum(a, b);
	getch();
}
int subNum(int x, int y)
{
	int c;
	c = x - y;
	printf("Substraction of %d - %d = %d", x,y,c);
	return 0;
}
