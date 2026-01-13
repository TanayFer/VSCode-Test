#Write a program to count vowels, consonants, digits, and spaces in a string.
vowels = 0
cons = 0
digits = 0
spaces = 0

s = input('Enter A String: ')

for char in s:
    if char.isspace():
        spaces += 1
    elif char.isdigit():
        digits += 1
    elif char.isalpha():
        if char.lower() in 'aeiou':
            vowels += 1
        else:
            cons += 1

print(f"Vowels: {vowels}")
print(f"Consonants: {cons}")
print(f"Digits: {digits}")
print(f"Spaces: {spaces}") 