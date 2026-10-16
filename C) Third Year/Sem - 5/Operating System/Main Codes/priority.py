n = int(input("Enter number of processes: "))
processes = []

print("(Note: Lower integer = Higher Priority)")
for i in range(n):
    bt = int(input(f"Enter Burst Time for P{i+1}: "))
    pr = int(input(f"Enter Priority for P{i+1}: "))
    processes.append([i+1, bt, pr]) 

processes.sort(key=lambda x: x[2])

wt = [0] * n
tat = [0] * n

for i in range(1, n):
    wt[i] = wt[i-1] + processes[i-1][1]

for i in range(n):
    tat[i] = wt[i] + processes[i][1]

print("\nProcess\t Burst\t Priority  Waiting\t Turnaround")
for i in range(n):
    print(f"P{processes[i][0]}\t {processes[i][1]}\t {processes[i][2]}\t   {wt[i]}\t\t {tat[i]}")sssss