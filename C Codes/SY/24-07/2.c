#include<stdio.h>	
#include<string.h>
int main()	{
	int ary[100], no;
	printf("Enter number of elements you want to enter: ");
	scanf("%d", &no);
	printf("Enter %d elements\n", no);
	//Input
	for(int i=0; i<no; i++)	{
		scanf("%d", &ary[i]);
	}
	//O/P for entered Elements
	printf("Entered Elements\n");
	for(int i=0; i<no; i++)	{
		printf("%d\t", ary[i]);
	}
	
	//Insertion Sorting
	for(int i=0; i<no-1; i++) {
		int a = ary[i];
		for(int j=0; j<no; j++) 
		{
			for(int k=0; k<no-i-1; k++) 
			{	
				if(ary[k] > ary[k+1]) {	
					a = ary[k];		
					ary[k] = ary[k+1];
					ary[k+1] = a;
				}		
			}		
		}
	}
	//O/P for Sorted Array
	printf("\nSorted\n");
	for(int i=0; i<no; i++)	{
		printf("%d\t", ary[i]);
	}
	
	return 0;
}