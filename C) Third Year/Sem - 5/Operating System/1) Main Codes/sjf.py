n = int(input("Number of processes: "))
p = []
for i in range(n):
    at = int(input(f"AT for P{i+1}: "))
    bt = int(input(f"BT for P{i+1}: "))
    p.append([i+1, at, bt, False])

t = 0
completed = 0

print("\nP\tAT\tBT\tCT\tTAT\tWT")
while completed < n:
    ready = [x for x in p if x[1] <= t and not x[3]]
    if not ready:
        t += 1
        continue
    ready.sort(key=lambda x: x[2])
    curr = ready[0]
    t += curr[2]
    idx = p.index(curr)
    p[idx][3] = True
    completed += 1
    ct = t
    tat = ct - curr[1]
    wt = tat - curr[2]
    print(f"P{curr[0]}\t{curr[1]}\t{curr[2]}\t{ct}\t{tat}\t{wt}")