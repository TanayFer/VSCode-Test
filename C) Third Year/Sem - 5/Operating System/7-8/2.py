# Python program to demonstrate process creation using multiprocessing.
from multiprocessing import Process
import os

def task():
    print("Child Process ID:", os.getpid())

if __name__ == "__main__":
    print("Parent Process ID:", os.getpid())
    p = Process(target=task)
    p.start()
    p.join()
    print("Process Finished")