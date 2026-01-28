# Create a set and perform add/remove operations
set_main = set()
exit = 0
while exit == 0:
    print("-------Select What You Want to Perform---------")
    print("1:-Add")
    print("2:-Duplicate")
    print("3:-Remove")
    print("4:-Discard")
    print("5:-Exit")
    
    sel = int(input('Enter Option: '))
    if sel == 1:
        set_main.add(int(input('Enter No: ')))
    elif sel == 2:
        set_main.add(int(input('Enter No. to Duplicate: ')))
    elif sel == 3:
        set_main.remove(int(input('Enter No. you want to remove: ')))
    elif sel == 4:
        set_main.discard(int(input('Enter No. to discard: ')))
    elif sel == 5:
        exit = 1
    else:
        print("Error")
    
    if exit == 0:
        print("Current set:", set_main)


