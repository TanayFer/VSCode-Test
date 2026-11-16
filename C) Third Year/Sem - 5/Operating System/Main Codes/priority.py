n = int(input("Number of processes: "))
p = []
for i in range(n):
    at = int(input(f"AT for P{i+1}: "))
    bt = int(input(f"BT for P{i+1}: "))
    pr = int(input(f"Priority for P{i+1} (lower=higher): "))
    p.append([i+1, at, bt, pr, False])

t = 0
completed = 0

print("\nP\tAT\tBT\tPR\tCT\tTAT\tWT")
while completed < n:
    ready = [x for x in p if x[1] <= t and not x[4]]
    if not ready:
        t += 1
        continue
    ready.sort(key=lambda x: x[3])
    curr = ready[0]
    t += curr[2]
    idx = p.index(curr)
    p[idx][4] = True
    completed += 1
    ct = t
    tat = ct - curr[1]
    wt = tat - curr[2]
    print(f"P{curr[0]}\t{curr[1]}\t{curr[2]}\t{curr[3]}\t{ct}\t{tat}\t{wt}")