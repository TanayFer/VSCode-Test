#include <stdio.h>
int main() 
{
    float percentage;
    int perc, rep;
    do
    {
    printf("Enter Percentage: ");
    scanf("%f", &percentage);
    if (percentage < 0 || percentage > 100) {
        printf("Error: Percentage must be between 0 till 100.\n");
        return 1;
    }

    perc = (int)percentage; 

    switch (perc / 10) 
	{
        case 10:  
        case 9:   
        case 8:   
            printf("A Grade\n");
            break;
        case 7:   
            printf("B Grade\n");
            break;
        case 6:   
            printf("C Grade\n");
            break;
        case 5:   
            printf("D Grade\n");
            break;
        case 4:   
            printf("E Grade\n");
            break;
        default:  
            printf("Fail\n");
            break;
    }
    printf("-------------------------\n");
    printf("Enter 1 To start Again : ");
    scanf("%d", &rep);
    printf("-------------------------\n");
}while(rep==1);
    return 0;
}
