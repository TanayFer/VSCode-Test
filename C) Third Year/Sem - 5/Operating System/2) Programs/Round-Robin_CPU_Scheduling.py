def round_robin(processes, burst_time, quantum):
    n = len(processes)
    rem_bt = list(burst_time)
    t = 0
    wt = [0] * n
    tat = [0] * n

    while True:
        done = True
        for i in range(n):
            if rem_bt[i] > 0:
                done = False
                if rem_bt[i] > quantum:
                    t += quantum
                    rem_bt[i] -= quantum
                else:
                    t += rem_bt[i]
                    wt[i] = t - burst_time[i]
                    rem_bt[i] = 0
        if done:
            break

    for i in range(n):
        tat[i] = burst_time[i] + wt[i]

    print("Process\tBurst Time\tWaiting Time\tTurnaround Time")
    for i in range(n):
        print(f"P{processes[i]}\t\t{burst_time[i]}\t\t{wt[i]}\t\t{tat[i]}")

round_robin([1, 2, 3], [10, 4, 2], 2)