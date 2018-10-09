
def Maximum(a,b):
    if a > b:
        return a
    else:
        return b

def isPrime(num):
    for i in range(2,num-1):
        if num % i == 0:
            return False
    return True
        
        
num = 600851475143
a = 0
for i in xrange(2,num):
    if num % i == 0:
        if not isPrime(i):
           break
        a = Maximum(a,i)
print a
