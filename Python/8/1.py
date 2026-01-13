# Create a set and perform add/remove operations

set_main = set()

set_main.add(10)
set_main.add(20)
set_main.add(30)
set_main.add(40)

print("Initial set:", set_main)

#Duplicate
set_main.add(20)
print("After adding duplicate 20:", set_main)

#Removing
set_main.remove(20)
print("After removing 20:", set_main)

#Discarding
set_main.discard(40)
print("After discarding 40:", set_main)