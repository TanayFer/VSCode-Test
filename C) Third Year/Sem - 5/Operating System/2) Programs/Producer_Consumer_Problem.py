import threading
import time
import random

buffer = []
BUFFER_SIZE = 3

mutex = threading.Semaphore(1)
full = threading.Semaphore(0)
empty = threading.Semaphore(BUFFER_SIZE)

def producer():
    for i in range(4):
        item = random.randint(1, 50)
        empty.acquire()
        mutex.acquire()
        buffer.append(item)
        print(f"Produced: {item} | Buffer: {buffer}")
        mutex.release()
        full.release()
        time.sleep(1)

def consumer():
    for i in range(4):
        full.acquire()
        mutex.acquire()
        item = buffer.pop(0)
        print(f"Consumed: {item} | Buffer: {buffer}")
        mutex.release()
        empty.release()
        time.sleep(1.5)

t1 = threading.Thread(target=producer)
t2 = threading.Thread(target=consumer)

t1.start()
t2.start()
t1.join()
t2.join()