#include <stdio.h>

void countdown(int seconds) 
{
// Base case: countdown reaches zero
if (seconds == 0) 
{
printf("Blastoff!\n");
}
 else 
 {
// Display the current second
printf("%d seconds\n", seconds);
// Recursive call with a smaller value
countdown(seconds - 1);
}
}
int main() 
{

int initialSeconds = 10;
countdown(initialSeconds);

return 1;
}