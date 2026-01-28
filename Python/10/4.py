#Write a program to count the occurrence of each word in a paragraph.
A = input('Enter A Sentence: ')

W1 = A.split()
Occur = sorted(set(W1), key=lambda x: W1.count(x), reverse=True)
for word in Occur:
    print(f'{word}: {W1.count(word)}')