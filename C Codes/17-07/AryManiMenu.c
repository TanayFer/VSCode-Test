#include<stdio.h>
#include<string.h>
int main()  {
    int ary[100], nos=0, opt, a;
    do
    {

    
    printf("1---------Array Menu-------------\n");
    printf("\nInsert Elements:- 1");
    printf("\nView Elements:- 2");
    printf("\nMaximum:- 3");
    printf("\nMinimum:- 4");
    printf("\nEnter your choice: ");
    scanf("%d", &opt);
    
    switch (opt)
    {
    case 1:
        printf("Enter how many numbers you want to insert: ");
        scanf("%d", &nos);
        for (int i = 0; i < nos; i++)
        {
            scanf("%d", &ary[i]);
        }
        break;

    case 2:
    if (nos > 0)    {
        printf("Entered Elements: \n");
        for (int i = 0; i < nos; i++)
        {
            printf("%d\t", ary[i]);
        }
        printf("\n");
    }else{
        printf("Array is empty\n");
    }
    break;

    case 3: //max
        if (nos > 0) {
            int max = ary[0];
            for (int i = 1; i < nos; i++) {
                if (ary[i] > max)
                    max = ary[i];
            }
            printf("Maximum: %d\n", max);
        } else {
            printf("Array is empty.\n");
        }
        break;

    case 4: //min
        if (nos > 0) {
            int min = ary[0];
            for (int i = 1; i < nos; i++) {
                if (ary[i] < min)
                    min = ary[i];
            }
            printf("Minimum: %d\n", min);
        } else {
            printf("Array is empty.\n");
        }
        break;

    default:
        printf("\nError 404");
        break;
    }
    printf("Menu:- Enter 1 / Else 0\n");
    scanf("%d", &a);
    } while (a==1);
    return 0;
}