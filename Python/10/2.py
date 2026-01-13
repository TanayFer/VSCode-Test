#Write a program to format a student grade card using f-strings.
name = input("Enter Student Name: ")
roll = input("Enter Roll Number: ")
english = int(input("Enter English Marks: "))
math = int(input("Enter Math Marks: "))
science = int(input("Enter Science Marks: "))

total = english + math + science
percentage = (total / 300) * 100

print("\n" + "-"*40)
print(f"{'          STUDENT GRADE CARD'}")
print("-"*40)
print(f"Name: {name}")
print(f"Roll Number: {roll}")
print(f"{'Subject':<20} {'Marks':>10}")
print("-"*40)
print(f"{'English':<20} {english:>10}")
print(f"{'Math':<20} {math:>10}")
print(f"{'Science':<20} {science:>10}")
print("-"*40)
print(f"{'Total':<20} {total:>10}")
print(f"{'Percentage':<20} {percentage:>9.2f}%")
print("-"*40 + "\n")