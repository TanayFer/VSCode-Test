#include<stdio.h>
#include<stdlib.h>

int main()  {
    int opt;
    int a, b, c;
    float x, y, z;
    printf("--------------------Calculator-------------------------\n");
    printf("\nAddition:- 1");
    printf("\nSubstraction:- 2");
    printf("\nMultiplication:- 3");
    printf("\nDivision:- 4");
    printf("\nModulus:- 5");
    printf("\nExit:- 6");
    printf("\nEnter which calculation you want to proceed with: ");
    scanf("%d", &opt);

    switch (opt) {
        case 1:
            printf("Enter 2 Numbers:\n");
            scanf("%d %d",&a,&b);
            c = a+b;
            printf("Addition: %d", c);
            break;

        case 2:
            printf("Enter 2 Numbers:\n");
            scanf("%d %d",&a,&b);
            c = a-b;
            printf("Substraction: %d", c);
            break;

        case 3:
            printf("Enter 2 Numbers:\n");
            scanf("%d %d",&a,&b);
            c = a*b;
            printf("Multiplication: %d", c);
            break;

        case 4:
            printf("Enter 2 Numbers:\n");
            scanf("%f %f",&x,&y);
            if(y != 0) {
                z = x/y;
                printf("Division: %.2f", z);
            } else {
                printf("Error: Division by zero!");
            }
            break;

        case 5:
            printf("Enter 2 Numbers:\n");
            scanf("%d %d",&a,&b);
            if(b != 0) {
                c = a%b;
                printf("Modulus: %d", c);
            } else {
                printf("Error: Division by zero!");
            }
            break;

        case 6:
            exit(0);

        default: 
            printf("Error 404");
            break;
    }
    return 0;
}