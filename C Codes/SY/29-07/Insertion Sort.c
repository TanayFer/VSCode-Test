//Insertion sort
#include<stdio.h>
int main()	{
	int ary[100], no,j;
	printf("Enter how many elements you want to enter: ");
	scanf("%d",&no);
	//Input
	for(int i=0; i<no; i++)	{
		printf("Enter %d element: ",i+1);
		scanf("%d", &ary[i]);
	}
	
	//O/P Before Sorting
	printf("--------Entered elements--------\n");
	for(int i=0; i<no; i++)	{
		printf("%d\t", ary[i]);
	}
	
	//Insertion ALgo
	for (int i = 1; i < no; i++) {
	    int a = ary[i];
	    int j = i - 1;
	
	    for (; j >= 0 && ary[j] > a; j--) {
	        ary[j + 1] = ary[j];
	    }
	    
	    ary[j + 1] = a;
	}
	
	//Sorted Ary O/P
    printf("\n---------Sorted Array--------\n");
    for(int i=0; i<no; i++)	{
    	printf("%d\t", ary[i]);
	}
	
	return 0;
}