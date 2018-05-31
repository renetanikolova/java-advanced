package lab;

import java.util.Scanner;

public class FillTheMatrix {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		String[] lineInput = scanner.nextLine().replaceAll(" ", "").split(",");

		if (lineInput[1].equals("A")) {
			printMatrix(constructMatrixA(Integer.parseInt(lineInput[0])));
		} else if (lineInput[1].equals("B")) {
			printMatrix(constructMatrixB(Integer.parseInt(lineInput[0])));
		}

	}

	// method for variant A
	public static int[][] constructMatrixA(int n) {

		int[][] matrix = new int[n][n];
		int number = 1;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[j][i] = number;
				number++;
			}
		}

		return matrix;
	}

	// method for variant B
	public static int[][] constructMatrixB(int n) {

		int[][] matrix = new int[n][n];
		int number = 1;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i % 2 != 0) {
					matrix[matrix.length - 1 - j][i] = number;
				} else {
					matrix[j][i] = number;
				}
				number++;
			}
		}

		return matrix;
	}

	// method for printing the matrix
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println();
		}
	}

}
