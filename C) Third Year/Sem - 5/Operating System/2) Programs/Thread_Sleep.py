import threading
import time

def thread_task(name, delay):
    print(f"Thread {name} started.")
    time.sleep(delay)
    print(f"Thread {name} finished after sleeping for {delay} seconds.")

# Creating threads
t1 = threading.Thread(target=thread_task, args=("Alpha", 2))
t2 = threading.Thread(target=thread_task, args=("Beta", 1))

# Starting threads
t1.start()
t2.start()

# Waiting for both threads to complete
t1.join()
t2.join()

print("All threads completed execution.")