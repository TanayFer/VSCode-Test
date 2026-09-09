#include<stdio.h>
#include<math.h>
#include<string.h>
int Prime();
int AS();
int EO();
int Pal();
int perfect();

int main()  {
    int opt;
    printf("---------Program using Functions----------\n");
    printf("Prime :- 1\n");
    printf("Armstrong :- 2\n");
    printf("Even Odd :- 3\n");
    printf("Pallindrome :- 4\n");
    printf("Real :- 5\n");
    scanf("%d", &opt);
    switch (opt)
    {
    case 1:
        Prime();
        break;
        
    case 2:
        AS();
        break;
        
    case 3:
        EO();
        break;
        
    case 4:
        Pal();
        break;
        
    case 5:
        perfect();
        break;
    
    default:printf("Error 404");
        break;
    }

    return 0;
}

int Prime() {
    int no, i, isPrime = 1;

    printf("Enter a number (To check if it's prime or not): ");
    scanf("%d", &no);
    if (no <= 1) {
        isPrime = 0;
    } else {
        for (i = 2; i <= no / 2; i++) {
            if (no % i == 0) {
                isPrime = 0;
            }
        }
    }
    if (isPrime) {
        printf("Number is prime\n");
    } else {
        printf("Number is not prime\n");
    }
};

int AS()	{
    int num, original, rem, n = 0;
    int result = 0;
    printf("Enter a number: ");
    scanf("%d", &num);
    original = num;
    while (original != 0) {
        original /= 10;
        n++;
    }
    original = num;
    while (original != 0) {
        rem = original % 10;
        result += pow(rem, n);
        original /= 10;
    }
    if (result == num)
        printf("%d is an Armstrong number.\n", num);
    else
        printf("%d is not an Armstrong number.\n", num);
    return 0;
};

int EO()	{
	int *a, *b, c, d;
	a=&c;
	printf("Enter 1 Integers\n");
	scanf("%d", &c);
	if(*a % 2 == 0)	{
		printf("Number is Even");
	}else{
		printf("Number is Odd");
	}
	return 0;
};

int Pal()	{
    char str[100], rev[100];
    int len, i, j;

    printf("Enter a string/number to check if it's a palindrome: ");
    scanf("%s", str);

    len = strlen(str);

    for (i = len - 1, j = 0; i >= 0; i--, j++) {
        rev[j] = str[i];
    }

    if (strcmp(str, rev) == 0) {
        printf("It's a Palindrome!\n");
    } else {
        printf("Not a Palindrome.\n");
    }

    return 0;
};

int perfect()	{
    int num, sum = 0;

    printf("Enter a number: ");
    scanf("%d", &num);

    for(int i = 1; i < num; i++) {
        if(num % i == 0) {
            sum += i;
        }
    }

    if(sum == num)
        printf("%d is a perfect number.\n", num);
    else
        printf("%d is not a perfect number.\n", num);

    return 0;	
};