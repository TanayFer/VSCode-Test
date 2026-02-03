name = input("Enter Student Name: ")
roll = input("Enter Roll Number: ")
english = int(input("Enter English Marks: "))
math = int(input("Enter Math Marks: "))
science = int(input("Enter Science Marks: "))

total = english + math + science
percentage = (total / 300) * 100

print("\n"+ "-"*40)
print("STUDENT GRADE CARD")
print("-"*40)

print("Name:", name)
print("Roll Number:", roll)
print("-"*40)

print("English:", english)
print("Math:", math)
print("Science:", science)
print("-"*40)

print("Total:", total)
print("Percentage:", f"{percentage:.2f}%")