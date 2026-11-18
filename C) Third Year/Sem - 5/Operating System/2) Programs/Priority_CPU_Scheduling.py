def calculate_priority(processes, burst_time, priority):
    n = len(processes)
    # Sort by priority
    zipped = sorted(zip(processes, burst_time, priority), key=lambda x: x[2])
    processes, burst_time, priority = zip(*zipped)

    wt = [0] * n
    tat = [0] * n

    for i in range(1, n):
        wt[i] = wt[i - 1] + burst_time[i - 1]

    for i in range(n):
        tat[i] = wt[i] + burst_time[i]

    print("Process\tPriority\tBurst Time\tWaiting Time\tTurnaround Time")
    for i in range(n):
        print(f"P{processes[i]}\t{priority[i]}\t\t{burst_time[i]}\t\t{wt[i]}\t\t{tat[i]}")

calculate_priority([1, 2, 3], [10, 5, 8], [2, 0, 1])