# Optimal Page Replacement
frames_n = int(input("Number of frames: "))
pages = list(map(int, input("Reference string (space separated): ").split()))

frames = []
faults = 0

print("\nPage  Frames          Result")
for i, p in enumerate(pages):
    if p in frames:
        result = "Hit"
    else:
        faults += 1
        result = "Fault"
        if len(frames) < frames_n:
            frames.append(p)
        else:
            future = pages[i + 1:]
            farthest, victim = -1, 0
            for j, f in enumerate(frames):
                if f not in future:      
                    victim = j
                    break
                nxt = future.index(f)
                if nxt > farthest:
                    farthest, victim = nxt, j
            frames[victim] = p
    print(f"{p:<5} {str(frames):<15} {result}")

print(f"\nTotal page faults: {faults}")
print(f"Total page hits  : {len(pages) - faults}")