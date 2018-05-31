package lab;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[][] matrix = new int[n][n];

		// get input
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		sumTheDiagonals(matrix);

	}

	private static void sumTheDiagonals(int[][] matrix) {

		int primarySum = 0;
		int secondarySum = 0;

		for (int i = 0; i < matrix.length; i++) {
			// primary diagonal
			primarySum += matrix[i][i];
			// secondary diagonal
			secondarySum += matrix[i][matrix.length - i - 1];
		}

		System.out.println(Math.abs(primarySum - secondarySum));

	}
}
