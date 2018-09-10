def summation(number):
	array = []
	while number != 0:
		addit = (number%10)**2
		array.append(addit)
		number //= 10
	result = sum(array)
	return result

def happy(number):
	lost = []
	while number != 1:
		if number in lost:
			return False
		lost.append(number)
		number = summation(number)
	return True