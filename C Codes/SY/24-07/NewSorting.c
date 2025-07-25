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
	
	//Insertion Sort
	for (int i = 1; i < no; i++) {
	    int key = ary[i];
	    int j;
	    for (j = i - 1; j >= 0 && ary[j] > key; j--) {
	        ary[j + 1] = ary[j];
	    }
	    ary[j + 1] = key;
}
	
	//O/P for Sorted Array
	printf("\nSorted\n");
	for(int i=0; i<no; i++)	{
		printf("%d\t", ary[i]);
	}
	
	return 0;
}