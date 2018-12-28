from Calculator import calculate_determinant

def main():
	print("Input your square matrix with values separated by commas.")
	lines = [ ]
	lines.append(input().split(","))

	count = len(lines[0]) - 1
	while count > 0:
		lines.append(input().split(","))
		count -= 1

	# parse the lists into lists of floats instead of strings
	for line in lines:
		for i in range(0, len(line)):
			line[i] = float(line[i])

	output = calculate_determinant(lines)
	print("Determinant: {}".format(output))

if __name__ == '__main__':
	try:
		main()
	except ValueError:
		os.system("cls")
		print("Invalid input.")
		main()