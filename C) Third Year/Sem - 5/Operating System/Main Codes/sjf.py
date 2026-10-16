n = int(input("Enter number of processes: "))
processes = []

for i in range(n):
    bt = int(input(f"Enter Burst Time for P{i+1}: "))
    processes.append([i+1, bt]) 

processes.sort(key=lambda x: x[1])

wt = [0] * n
tat = [0] * n

for i in range(1, n):
    wt[i] = wt[i-1] + processes[i-1][1]

for i in range(n):
    tat[i] = wt[i] + processes[i][1]

print("\nProcess\t Burst Time\t Waiting Time\t Turnaround Time")
for i in range(n):
    print(f"P{processes[i][0]}\t\t {processes[i][1]}\t\t {wt[i]}\t\t {tat[i]}")