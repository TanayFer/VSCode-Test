import math
import statistics
import datetime

def fact(a):
    return math.factorial(a)

def sq_rt(a):
    return math.isqrt(a)

def Mean(a, b):
    return statistics.mean([a, b])

def Median(a, b):
    return statistics.median([a, b])

def DateTime():
    return datetime.datetime.now()