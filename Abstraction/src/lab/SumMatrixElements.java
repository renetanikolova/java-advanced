package lab;

import java.util.Scanner;

public class SumMatrixElements {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] rowCol = input.nextLine().split(", ");
		int row = Integer.parseInt(rowCol[0]);
		int col = Integer.parseInt(rowCol[1]);

		int[][] matrix = new int[row][col];
		long sum = 0;

		for (int i = 0; i < row; i++) {
			String[] line = input.nextLine().split(", ");
			for (int j = 0; j < col; j++) {
				matrix[i][j] = Integer.parseInt(line[j]);
			}
		}

		for (int[] number : matrix) {
			for (int value : number) {
				sum += value;
			}
		}

		System.out.printf("%d%n%d%n%d%n", row, col, sum);

	}

}
