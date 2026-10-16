n = int(input("Number of processes: "))
p = []
for i in range(n):
    at = int(input(f"AT for P{i+1}: "))
    bt = int(input(f"BT for P{i+1}: "))
    p.append([i+1, at, bt, bt])
q = int(input("Time Quantum: "))

p.sort(key=lambda x: x[1])
t = 0
completed = 0
queue = []
in_queue = [False] * n

if p[0][1] > t:
    t = p[0][1]
queue.append(0)
in_queue[0] = True

print("\nP\tAT\tBT\tCT\tTAT\tWT")
while completed < n:
    if not queue:
        t += 1
        for i in range(n):
            if p[i][1] <= t and not in_queue[i] and p[i][3] > 0:
                queue.append(i)
                in_queue[i] = True
        continue
    
    i = queue.pop(0)
    execute_time = min(p[i][3], q)
    t += execute_time
    p[i][3] -= execute_time

    for j in range(n):
        if p[j][1] <= t and not in_queue[j] and p[j][3] > 0:
            queue.append(j)
            in_queue[j] = True
    
    if p[i][3] > 0:
        queue.append(i)
    else:
        completed += 1
        ct = t
        tat = ct - p[i][1]
        wt = tat - p[i][2]
        print(f"P{p[i][0]}\t{p[i][1]}\t{p[i][2]}\t{ct}\t{tat}\t{wt}")