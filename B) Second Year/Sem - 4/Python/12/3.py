#Write a program to find factorial, prime, and Armstrong numbers using functions.

def factorial(n):
	if n < 0:
		print("Error 404")
		return None
	result = 1
	for i in range(2, n + 1):
		result *= i
	return result


def is_prime(n):
	if n <= 1:
		return False
	if n == 2:
		return True
	if n % 2 == 0:
		return False
	cntr = 0
	for i in range(1, n + 1):
		if (n % i == 0):
			cntr = cntr + 1
	if (cntr == 2):
		return True
	else:
		return False

def is_armstrong(n):
	


print("===============Menu===============")
print("1 : Factorial")
print("2 : Prime Check")
print("3 : Armstrong Check")
print("4 : Exit")

opt = int(input("Enter Option: "))

if opt == 1:
	num = int(input("Enter a number: "))
	value = factorial(num)
	if value is None:
		print("Factorial is not defined for negative numbers")
	else:
		print("Factorial:", value)
elif opt == 2:
	num = int(input("Enter a number: "))
	if is_prime(num):
		print("Prime number")
	else:
		print("Not a prime number")
elif opt == 3:
	num = int(input("Enter a number: "))
	if is_armstrong(num):
		print("Armstrong number")
	else:
		print("Not an Armstrong number")
elif opt == 4:
	exit()
else:
	print("Error 404")
