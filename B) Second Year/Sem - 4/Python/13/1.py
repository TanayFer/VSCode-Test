import myMod
print("===============Calculator===============")
print("1 : Addition")
print("2 : Substraction")
print("3 : Multiplication")
print("4 : Division")
print("5 : Exit")

num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

opt = int(input("Enter Option: "))

if opt == 1:
	result = myMod.add_numbers(num1, num2)
	print("Result:", result)
elif opt == 2:
	result = myMod.sub_numbers(num1, num2)
	print("Result:", result)
elif opt == 3:
	result = myMod.mul_numbers(num1, num2)
	print("Result:", result)
elif opt == 4:
	if num2 == 0:
		print("Error: Division by zero")
	else:
		result = myMod.div_numbers(num1, num2)
		print("Result:", result)
elif opt == 5:
	exit
else:
	print("Invalid option")