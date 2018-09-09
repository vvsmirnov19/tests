def fib(n):
	list = [0, 1]
	if n == 0:
		return [0]
	else:
		while list[len(list)-1] <= n - list[len(list)-2]:
			val = list[len(list)-1] + list[len(list)-2]
			list.append(val)
		return list