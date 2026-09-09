#Write a program to validate a mobile number using regex. 
import re
A = input('Enter A Phone Number: ')
A1 = re.fullmatch(r"\d{10}", A)
if A1:
    print("Valid Phone Number")
else:
    print("Invalid Phone Number")