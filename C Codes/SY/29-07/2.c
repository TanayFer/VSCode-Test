//Bubble Sort
#include<stdio.h>
int main()	{
	int ary[100], no;
	printf("How many elements you want to enter: ");
	scanf("%d", &no);
	
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
	
	//Main Algo
	for(int i = 0; i < no; i++)
    {
        for(int j = 0; j < no - i - 1; j++)
        {
            if(ary[j] > ary[j + 1])
            {
                int t = ary[j];
                ary[j] = ary[j + 1];
                ary[j + 1] = t;
            }
        }
    }
    
    //Sorted Ary O/P
    printf("\n---------Sorted Array--------\n");
    for(int i=0; i<no; i++)	{
    	printf("%d\t", ary[i]);
	}
	return 0;
}