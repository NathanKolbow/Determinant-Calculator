import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Input your square matrix, seperated by spaces. Input a blank enter once you are done.");
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		ArrayList<String> allIn = new ArrayList<String>();
		while(!line.equals("")) {
			allIn.add(line);
			line = in.nextLine();
		}
		double[][] matrix = new double[allIn.size()][allIn.size()];
		for(int y = 0; y < matrix.length; y++) {
			String[] str = allIn.get(y).split(" ");
			for(int x = 0; x < matrix[y].length; x++) {
				matrix[y][x] = Double.parseDouble(str[x]);
			}
		}
		double det = Calculator.calculateDeterminant(matrix);
		System.out.println("Determinant: " + det);
	}
	
}
