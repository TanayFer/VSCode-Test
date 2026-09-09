#Common elements between two lists using sets.
a = [10, 20, 30, 40, 50]
b = [40, 50, 80, 90, 100]
print("A : ", a)
print("B : ", b)

#Common
C = set(a) & set(b)
print(C)

#All
D = set(a) | set(b)
D = sorted(D)
print(D)