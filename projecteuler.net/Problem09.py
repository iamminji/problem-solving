
from math import pow,sqrt
import time

def solution():
    t = time.time()
    for b in range(1,500):
        if 1000*(500-b) % (1000-b) == 0:
            a = 1000*(500-b) / (1000-b)
            if a < b:
                print a * b * (sqrt(pow(a,2) + pow(b,2)))
                print time.time() - t

solution()
