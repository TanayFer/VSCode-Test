import threading

def display():
    for i in range(5):
        print("Thread Running:", i)

# Create a thread target pointing to the display function
t = threading.Thread(target=display)

t.start()
t.join()

print("Main Thread Ends")