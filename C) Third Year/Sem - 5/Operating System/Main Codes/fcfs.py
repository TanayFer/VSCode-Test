n = int(input("Number of processes: "))
p = []
for i in range(n):
    at = int(input(f"AT for P{i+1}: "))
    bt = int(input(f"BT for P{i+1}: "))
    p.append([i+1, at, bt])

p.sort(key=lambda x: x[1])
t = 0

print("\nP\tAT\tBT\tCT\tTAT\tWT")
for i in range(n):
    if t < p[i][1]:
        t = p[i][1]
    t += p[i][2]
    ct = t
    tat = ct - p[i][1]
    wt = tat - p[i][2]
    print(f"P{p[i][0]}\t{p[i][1]}\t{p[i][2]}\t{ct}\t{tat}\t{wt}")