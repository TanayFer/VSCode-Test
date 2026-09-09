import myMod2
print("===============Maths Functions===============")
print("1 : Factorial")
print("2 : Square Root")
print("3 : Mean")
print("4 : Median")
print("5 : Date Time")
print("6 : Exit")

opt = int(input('Select option: '))

if opt == 1:
    no1 = int(input('Enter number: '))
    fact = myMod2.fact(no1)    
    print("Factorial: ", fact)
elif opt == 2:
    no2 = int(input('Enter number: '))
    sqrt = myMod2.sq_rt(no2)  
    print("Square Root: ", sqrt)
elif opt == 3:
    no3 = int(input('Enter 1st number: '))
    no4 = int(input('Enter 2nd number: '))
    mean = myMod2.Mean(no3, no4)  
    print("Mean: ", mean)