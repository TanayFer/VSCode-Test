def lru(pages, capacity):
    frames = []
    faults = 0

    for page in pages:
        if page in frames:
            frames.remove(page)  # Refresh recency
            frames.append(page)
        else:
            faults += 1
            if len(frames) == capacity:
                frames.pop(0)    # Remove least recently used
            frames.append(page)
        print(f"Page: {page} -> Frames: {frames}")

    print("Total Page Faults:", faults)

lru([7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2], 3)