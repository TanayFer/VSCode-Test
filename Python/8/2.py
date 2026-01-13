#Find union, intersection, and difference of two sets

A = [1,2,3,4,5]
B = [4,5,6,7,8]
print("A : ",A);
print("B : ",B)

#Union
C = set(A) | set (B)
print(C)

#InterSection
D = set(A) & set (B)
print(D)

#Difference
E = set(C)-set(D)
print(E)