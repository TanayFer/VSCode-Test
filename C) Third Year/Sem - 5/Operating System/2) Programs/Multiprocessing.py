import multiprocessing
import os

def worker():
    print(f"--> Child Process | PID: {os.getpid()}, PPID: {os.getppid()}")

if __name__ == '__main__':
    print(f"Main/Parent Process | PID: {os.getpid()}")
    p = multiprocessing.Process(target=worker)
    p.start()
    p.join()
    print("Child process execution completed.")