package lab;

import java.util.Scanner;

public class SquaresInMatrix2x2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] lineCR = input.nextLine().split(" ");

		int r = Integer.parseInt(lineCR[0]);
		int c = Integer.parseInt(lineCR[1]);

		String[][] matrix = new String[r][c];
		String[] line = new String[c];

		// get input
		for (int i = 0; i < r; i++) {
			line = input.nextLine().split(" ");
			for (int j = 0; j < c; j++) {
				matrix[i][j] = line[j];
			}
		}

		System.out.println(findEqualSquares(matrix));

	}

	public static int findEqualSquares(String[][] matrix) {

		int countSquars = 0;

		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[i].length - 1; j++) {
				if (matrix[i][j].equals(matrix[i][j + 1]) && matrix[i + 1][j].equals(matrix[i + 1][j + 1])) {
					if (matrix[i][j].equals(matrix[i + 1][j])) {
						countSquars++;
					}
				}
			}
		}
		return countSquars;
	}

}
