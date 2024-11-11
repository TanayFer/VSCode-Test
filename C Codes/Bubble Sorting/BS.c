#include<stdio.h>
int main()
{
    int a[10], i, j, k, t;
    printf("Enter Elements\n");
    for(i = 0; i < 10; i++)
    {
        scanf("%d", &a[i]);
    }
    for(i = 0; i < 10; i++)
    {
        printf("Elements : %d\n", a[i]);
    }
    
    for(k = 0; k < 10; k++)
    {
        for(j = 0; j < 10 - k - 1; j++)
        {
            if(a[j] > a[j + 1])
            {
                t = a[j];
                a[j] = a[j + 1];
                a[j + 1] = t;
            }
        }
    }
    printf("The Sorted Array:\n");
    for(int m = 0; m < 10; m++)
    {
        printf("%d\n", a[m]);
    }
    return 0;
}
