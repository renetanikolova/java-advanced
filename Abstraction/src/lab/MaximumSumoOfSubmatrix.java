package lab;

import java.util.Scanner;

public class MaximumSumoOfSubmatrix {

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

		long currentSum = 0;
		long maxSum = 0;
		int maxI = 0;
		int maxJ = 0;

		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[i].length - 1; j++) {
				currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
				if (currentSum > maxSum) {
					maxSum = currentSum;
					maxI = i;
					maxJ = j;
				}
			}
		}

		String output =  String.format("%d %d%n%d %d%n%d%n", matrix[maxI][maxJ], matrix[maxI][maxJ + 1],
				matrix[maxI + 1][maxJ], matrix[maxI + 1][maxJ + 1], maxSum);
		System.out.print(output);
		
	}

}
