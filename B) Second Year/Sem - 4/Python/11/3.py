#Write a program to extract all numbers from a given text.
import re
A = input('Enter a Text: ')
A1 = re.findall(r'\d+', A)
print(A1)
