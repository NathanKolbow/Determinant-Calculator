def calculate_determinant(matrix):
	if len(matrix) is 1:
		return matrix[0][0]
	elif len(matrix) is 2:
		return (matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1])

	total = float()
	for i in range(0, len(matrix)):
		cofactor = (-1 ^ i) * matrix[0][i]
		minor = [ ]

		for y in range(1, len(matrix)):
			sub = 0
			for x in range(0, len(matrix[y])):
				if x is i:
					sub = -1
					continue
				minor[y - 1][x + sub] = matrix[y][x]

			total += cofactor * calculate_determinant(minor)
	return total