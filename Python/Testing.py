'''
# Return Type
def msg():
    print ("Hello")
msg()

def msg2():
    return "Hello"
m1 = msg2()
print(m1)

#Function Overloading
def add(a,b):
    return a+b
def add(a,b,c):
    return a+b+c

add2 = add(2,5,10)
print(add2)


def addN(*args):
    return sum(args)

print(addN(5,7))
print(addN(5,7, 10))
print(addN(5,7, 15, 84))

'''

print("------------Calc------------")
def addN(*args):
    return sum(args)
def subN(*args):
    result = args[0]
    for num in args[1:]:
        result -= num
    return result
def multi(*args):
    result = 1
    for num in args:
        result *= num
    return result
def divN(*args):
    result = args[0]
    for num in args[1:]:
        result /= num
    return result

print(addN(5,7))
print(subN(5,7))
print(multi(2 ,5,7))
print(divN(28, 14 ,7))