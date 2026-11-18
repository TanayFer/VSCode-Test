import os
import sys

print("--- Process Control Block (PCB) Info ---")
print("Process ID (PID):", os.getpid())
print("Parent Process ID (PPID):", os.getppid() if hasattr(os, 'getppid') else "N/A")
print("Real User ID:", os.getuid() if hasattr(os, 'getuid') else "N/A")
print("Process Group ID:", os.getpgrp() if hasattr(os, 'getpgrp') else "N/A")
print("Python Executable:", sys.executable)