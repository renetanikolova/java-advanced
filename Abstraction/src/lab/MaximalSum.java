package lab;

import java.util.Scanner;

public class MaximalSum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();

		int[][] matrix = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		findMaxSubmatrix(matrix);

	}

	public static void findMaxSubmatrix(int[][] matrix) {

		int maxSum = 0;
		int tempSum = 0;
		int maxI = 0;
		int maxJ = 0;

		for (int i = 0; i < matrix.length - 2; i++) {
			for (int j = 0; j < matrix[i].length - 2; j++) {
				tempSum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2];
				tempSum += matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2];
				tempSum += matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

				if (tempSum > maxSum) {
					maxSum = tempSum;
					tempSum = 0;
					maxI = i;
					maxJ = j;
				}

			}
		}

		printMaxMatrix(maxI, maxJ, matrix, maxSum);

	}

	public static void printMaxMatrix(int i, int j, int[][] matrix, int maxSum) {

		System.out.printf("Sum = %d%n", maxSum);

		for (int k = i; k < i + 3; k++) {
			for (int k2 = j; k2 < j + 3; k2++) {
				System.out.print(matrix[k][k2] + " ");
			}
			System.out.println();
		}

	}

}
