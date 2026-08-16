import threading


def task(name):
    for i in range(3):
        print(name, i)


# Creating two threads pointing to the task function
t1 = threading.Thread(target=task, args=("Thread-1",))
t2 = threading.Thread(target=task, args=("Thread-2",))

# Starting both threads
t1.start()
t2.start()

# Waiting for both threads to finish
t1.join()
t2.join()

print("Completed")