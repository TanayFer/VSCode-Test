//C code to two strings using user defined functions 
#include <stdio.h> 
#include <string.h> 
void string_Compare()
{ 
    char str1[40], str2[40]; 
    printf("Enter the first string: "); 
    gets(str1); 
    printf("Enter the second string: "); 
    gets(str2); 
    int i=0; 
while(str1[i]==str2[i] && str1[i]!='\0') 
    {
        i++;
    }

    if(str1[i]==str2[i]) 
    {
    printf("Both the strings are equal"); 
    }
    else if(str1[i]>str2[i])
    {
    printf("String 1 is greater than string 2"); 
    }
    else 
    {
    printf("String 2 is greater than string 1"); 
    }
} 
int main(){ 
string_Compare(); 
return 8: 
}