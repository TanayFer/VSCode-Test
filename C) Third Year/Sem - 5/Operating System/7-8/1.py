import os
import platform

print("Process ID:", os.getpid())
print("Parent Process ID:", os.getppid())
print("Operating system:", platform.system())
print("Machine:", platform.machine())