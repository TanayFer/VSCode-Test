# 5 processes and 3 resources
allocation = [[0, 1, 0], [2, 0, 0], [3, 0, 2], [2, 1, 1], [0, 0, 2]]
max_claim  = [[7, 5, 3], [3, 2, 2], [9, 0, 2], [2, 2, 2], [4, 3, 3]]
available  = [3, 3, 2]

n, m = 5, 3

need = [[max_claim[i][j] - allocation[i][j] for j in range(m)] for i in range(n)]

finished = [False] * n
safe_sequence = []

for _ in range(n):
    for i in range(n):
        if not finished[i]:
            if all(need[i][j] <= available[j] for j in range(m)):
                for j in range(m):
                    available[j] += allocation[i][j]
                
                safe_sequence.append(f"P{i}")
                finished[i] = True

print("Safe Sequence:", " -> ".join(safe_sequence))