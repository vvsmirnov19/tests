def checkcard(string):
	if len(string) == 0 or len(string) > 20:
		return False
	if int(string[0]) < 2 or int(string[0]) > 7:
		return False
	else:
		new_string = ''
		for i in range(len(string)):
			new_string = new_string + string[len(string)-1-i]
		summ = 0
		for j in range (len(new_string)):
			if j % 2 != 0:
				if int(new_string[j])*2 > 9:
					summ += int(new_string[j])*2 - 9
				else:
					summ += int(new_string[j])*2
			else:
				summ += int(new_string[j])
		if summ % 10 == 0:
			return True
		else:
			return False
