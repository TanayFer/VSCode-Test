import random
import threading
import time

BUFFER_SIZE = 5
buffer = []
mutex = threading.Semaphore(1)
full = threading.Semaphore(0)
empty = threading.Semaphore(BUFFER_SIZE)


class Producer(threading.Thread):

  def run(self):
    global buffer
    for i in range(5):
      item = random.randint(1, 100)
      empty.acquire()
      mutex.acquire()
      buffer.append(item)
      print(f"Produced: {item} | Buffer: {buffer}")
      mutex.release()
      full.release()
      time.sleep(0.3)


class Consumer(threading.Thread):

  def run(self):
    global buffer
    for i in range(5):
      full.acquire()
      mutex.acquire()
      item = buffer.pop(0)
      print(f"Consumed: {item} | Buffer: {buffer}")
      mutex.release()
      empty.release()
      time.sleep(0.5)


p = Producer()
c = Consumer()
p.start()
c.start()
p.join()
c.join()