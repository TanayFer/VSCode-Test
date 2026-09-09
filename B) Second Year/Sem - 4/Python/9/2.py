#Write a program to check whether a string is a palindrome.
A = input('Enter A String (Palindrome) : ')
print("Entered String : ", A)
if A == A[::-1]:
    print("It is a Palindrome");
else:
    print("Not a Palindrome");