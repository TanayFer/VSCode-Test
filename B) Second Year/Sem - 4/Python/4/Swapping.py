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

#Another +1 Method 
A1 = int(input('Enter Int A: '));
B1 = int(input('Enter Int A: '));
print(A1)
print(B1)

A1, B1 = B1, A1
print("After Swapping");
print(A1)
print(B1)