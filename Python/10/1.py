#Write a program to demonstrate string functions (upper, lower, replace, split, join).
A = input('Enter A String: ')
B = input('Enter Another String: ')

print("Original String:", A)
print("Upper:", A.upper())
print("Lower:", A.lower())

C = A.replace(A, B)
print("After Replace:", C)

print("Split:", A.split())

D = " ".join(A)
print("Joining:", D)
