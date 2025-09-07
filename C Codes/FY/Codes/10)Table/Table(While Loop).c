#include<stdio.h>

int main()
{
    int no, i = 1;
    printf("Enter Number: ");
    scanf("%d", &no);
    while(no > 0)
    {
        printf("%d * %d = %d\n", no, i, no * i); 
        i++;
        
        if(i > 10) 
            break;
    }
    return 0;
}
