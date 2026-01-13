#Write a program to remove punctuation from a string.
s = input('Enter A String: ')

result = ""
for char in s:
    if char.isalnum() or char.isspace():
        result += char

print("Original String:", s)
print("Without Punctuation:", result)