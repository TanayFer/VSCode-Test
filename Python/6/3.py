#Frequency
from collections import Counter
A = (10 , 20 , 10, 20, 15, 15, 20, 28)
print(A)

CNT = dict(Counter(A))
print(f"Frequency : {CNT}")
