#Write a program to find the longest word in a sentence.
A = input('Enter A Sentence: ')

W1 = A.split()
longest = max(W1, key=len)

print(f"Sentence: {A}")
print(f"Longest Word: {longest}")
print(f"Length: {len(longest)}")



























































