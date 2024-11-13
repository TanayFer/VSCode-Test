#include <stdio.h>
int main() 
{
int i,n,c=0;
printf ("Enter a number n ");
scanf ("%d",&n);
for (i=1; i<=n; i++)
{
if(n%i==0)
c=c+1;
}
if (c==2)
printf ("The number is PRIME");
else
printf ("The number is COMPOSITE");
return 0;
}