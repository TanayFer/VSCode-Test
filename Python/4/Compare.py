#Compare
A = int(input('Enter 1st Variable: '));
B = int(input('Enter Bst Variable: '));
if(A > B):
    print (A," is Greater");
    print (B," is Smaller");
elif(A < B):
    print (B," is Greater");
    print (A," is Smaller");
elif(A == B):
    print (A," is Equal");
    print (B," is Equal");
else:
    print("Error");