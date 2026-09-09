#Write a program to demonstrate variable scope (local vs global).
A = input('Enter A Text: ')

def No():
	B = input('Enter Your Sirname: ')
	print(B + ", This is Local Scope")

print(A + ", This is Global Scope")
No()