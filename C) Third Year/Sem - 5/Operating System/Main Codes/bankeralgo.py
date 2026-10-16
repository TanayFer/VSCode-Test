allocation = [[0, 1, 0], [2, 0, 0], [3, 0, 2], [2, 1, 1], [0, 0, 2]]
max_matrix = [[7, 5, 3], [3, 2, 2], [9, 0, 2], [2, 2, 2], [4, 3, 3]]
available = [3, 3, 2]

n = len(allocation)
m = len(available)

need = [[max_matrix[i][j] - allocation[i][j] for j in range(m)] for i in range(n)]
f = [0] * n
ans = []
count = 0

while count < n:
  found = False
  for i in range(n):
    if f[i] == 0:
      if all(need[i][j] <= available[j] for j in range(m)):
        for j in range(m):
          available[j] += allocation[i][j]
        ans.append(f"P{i}")
        f[i] = 1
        found = True
        count += 1
  if not found:
    print("System is not in a safe state.")
    break
else:
  print("System is in a safe state.")
  print("Safe Sequence:", " -> ".join(ans))