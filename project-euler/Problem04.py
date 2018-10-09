
def Maxnumber(a,b):
    if a > b:
        return a
    else:
        return b

def isPelindrome(num):
    num = str(num)
    length = len(num)
    for i in range(length):
        if i > (length-1)-i:
            break
        if num[i] == num[(length-1)-i]:
            continue
        else:
            return False
    return True

a=0

for i in range(99,1000):
    for j in range(99,1000):
        b = i*j
        if isPelindrome(b):
            a = Maxnumber(a,b)
print a