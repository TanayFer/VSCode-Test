def fifo(pages, capacity):
    frames = []
    faults = 0

    for page in pages:
        if page not in frames:
            faults += 1
            if len(frames) == capacity:
                frames.pop(0)  # Remove oldest page
            frames.append(page)
        print(f"Page: {page} -> Frames: {frames}")

    print("Total Page Faults:", faults)

fifo([7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2], 3)