# Calculate Frequency of words in Python using Dictionary
from collections import Counter

dict_fruits = [
    "Apple", "Banana", "Mango", "PineApple", "Guava", "Apple", "Banana", "Apple", "Mango"
]
print("Main list:", dict_fruits)

F1 = Counter(dict_fruits)
print("Frequency:", F1)