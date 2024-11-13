#include<stdio.h>
int main()
{
    int no;
    printf("Enter Number: ");
    scanf("%d", &no);
    for(int i = 1; i <= 10; i++)
    {
        printf("%d * %d = %d\n", no, i, no * i); 
    }
    return 0;
}
