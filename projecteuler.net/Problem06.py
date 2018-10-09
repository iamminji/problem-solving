
from math import pow

def totalPow(num):
    return num*(num+1)*(2*num+1)/6

def numPow(num):
    return pow(num*(num+1)/2,2)

for i in range(1,101):
    res = numPow(i) - totalPow(i)

print res
