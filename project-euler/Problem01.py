
def three_five(num):
	if num % 3 == 0 or num % 5 == 0:
		return num
	else:
		return 0
        
result = 0
for i in range(1000):
	result = three_five(i) + result

print result
