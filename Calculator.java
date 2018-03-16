
public class Calculator {

	public static void main(String[] args) {
		double[][] matrix = new double[][] { { 1, 0, 3 },
											{ 2, 3, 1 },
											{ 4, 4, 1 } };

		double det = calculateDeterminant(matrix);
		System.out.println(det);
	}

	public static double calculateDeterminant(double[][] matrix) {
		double res = calc(matrix);
		return res;
	}

	private static double calc(double[][] matrix) {
		if (matrix.length == 2)
			return (matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1]);
		
		double total = 0;

		for (int i = 0; i < matrix.length; i++) {
			double cofactor = Math.pow(-1, i) * matrix[0][i];
			double[][] minor = new double[matrix.length - 1][matrix.length - 1];

			for (int y = 1; y < matrix.length; y++) {
				int sub = 0;
				for (int x = 0; x < matrix[y].length; x++) {
					if (x == i) {
						sub = -1;
						continue;
					}
					minor[y - 1][x + sub] = matrix[y][x];
				}
			}
			
			total += cofactor * calc(minor);
		}

		return total;
	}

}
