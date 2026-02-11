#Write a program to split a string based on multiple delimiters.
import re
A = input('Enter a Text: ')
A1 = re.split(r'[,;:]+', A)
print(A1)
