
def isDivided(num):
    for i in range(1,21):
        if num % i != 0:
            return False
    return True

num = 2520
while True:
    if not isDivided(num):
        num += 2520
    else:
        break
print num