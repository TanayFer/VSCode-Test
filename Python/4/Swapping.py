#Using 3rd Variable
A = int(input('Enter 1st Number: '));
B = int(input('Enter 2nd Number: '));
print(A,"____________",B);
Temp = A;
A = B;
B = Temp;
print(A,"____________",B);

#W/O Using 3rd Variable
C = int(input('Enter 1st Number: '));
D = int(input('Enter 2nd Number: '));
print(C,"_____",D);
C = C+D;
D = C-D;
C = C-D;
print(C,"_____",D);