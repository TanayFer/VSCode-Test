#include<stdio.h>
void main()
{
	int i , top , bot , mid;
	float a[10], p;
	printf("Type Numbers(Ascending)\n");
	for(i=0 ; i<10 ; i++)
	{
		scanf("%d", &a[i]);
	}
	top=1;
	bot=10;
	printf("Enter the number you want to search : ");
	scanf("%d", &p);
	mid = (top + bot)/2;
	while((top<=bot) && (a[mid] != p))
	{
		if(p < a[mid])
		  bot = mid -1;
		else
		  top = mid + 1;
		mid = (top + bot)/2;
	}
	if(a[mid] == p)
	{
		printf("The number is at position : %d\n", mid+1);
	}
	else
	{
		printf("Number is not there");
	}
	return;
}

