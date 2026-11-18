def calculate_sjf(processes, burst_time):
    n = len(processes)
    # Sort processes based on burst time
    zipped = sorted(zip(processes, burst_time), key=lambda x: x[1])
    processes, burst_time = zip(*zipped)

    wt = [0] * n
    tat = [0] * n
    
    for i in range(1, n):
        wt[i] = wt[i - 1] + burst_time[i - 1]

    for i in range(n):
        tat[i] = wt[i] + burst_time[i]

    print("Process\tBurst Time\tWaiting Time\tTurnaround Time")
    for i in range(n):
        print(f"P{processes[i]}\t\t{burst_time[i]}\t\t{wt[i]}\t\t{tat[i]}")

calculate_sjf([1, 2, 3], [6, 2, 8])