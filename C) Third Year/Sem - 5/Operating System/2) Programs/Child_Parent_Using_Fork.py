import os

pid = os.fork()

if pid == 0:
    print(f"Child Process created. PID: {os.getpid()}, Parent PID: {os.getppid()}")
    os.execvp("echo", ["echo", "Hello from child process via exec()!"])
else:
    print(f"Parent Process (PID: {os.getpid()}) waiting for child...")
    os.wait()
    print("Child process has terminated. Parent exiting.")