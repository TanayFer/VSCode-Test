import numpy as np

arr = np.array([10, 21, 32, 43, 54, 65, 76])

even = arr[arr % 2 == 0]
odd = arr[arr % 2 != 0]

print("Even elements:", even)
print("Odd elements:", odd)