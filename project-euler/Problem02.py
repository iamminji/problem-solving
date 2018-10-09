
def Fibo(pre, next):
    next = pre + next
    return next

a = 0
b = 1
sum = 0
while 1:
    temp = b
    b = Fibo(a,b)
    if b > 4000000:
        break
    if b % 2 == 0:
        sum += b
    a = temp
print sum