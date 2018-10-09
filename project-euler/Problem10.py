
import time

def isPrime(n):
    if n <= 1:
        return False
    elif n <= 3:
        return True
    elif n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i+2) == 0:
            return False
        i = i+6
    return True

def solution():
    s = 0
    t = time.time()
    for i in range(0,2000000):
        if isPrime(i):
            s = s + i
    print s
    print time.time() - t

solution()
