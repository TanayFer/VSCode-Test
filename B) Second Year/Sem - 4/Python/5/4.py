#Sorting
A = [555, 125, 75, 11, 237];
print("Unsorted:", A);

for i in range(len(A) - 1): 
    for j in range(len(A) - 1 - i):
        if A[j] > A[j + 1]:
            A[j], A[j + 1] = A[j + 1], A[j];

print("Sorted:", A);

