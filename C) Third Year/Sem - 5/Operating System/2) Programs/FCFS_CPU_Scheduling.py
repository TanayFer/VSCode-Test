def calculate_fcfs(processes, burst_time):
    n = len(processes)
    wt = [0] * n
    tat = [0] * n

    # Waiting time for first process is 0
    wt[0] = 0
    for i in range(1, n):
        wt[i] = wt[i - 1] + burst_time[i - 1]

    for i in range(n):
        tat[i] = wt[i] + burst_time[i]

    print("Process\tBurst Time\tWaiting Time\tTurnaround Time")
    for i in range(n):
        print(f"P{processes[i]}\t\t{burst_time[i]}\t\t{wt[i]}\t\t{tat[i]}")

calculate_fcfs([1, 2, 3], [5, 3, 8])