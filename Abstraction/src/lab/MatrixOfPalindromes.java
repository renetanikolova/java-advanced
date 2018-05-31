package lab;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int r = input.nextInt();
		int c = input.nextInt();

		printMatrix(fillMatrix(r, c));

	}

	public static String[][] fillMatrix(int r, int c) {

		String[][] matrix = new String[r][c];
		char firstLastletter = 'a';
		char midlLetter = 'a';

		for (int i = 0; i < r; i++) {
			firstLastletter += i;
			midlLetter += i;
			for (int j = 0; j < c; j++) {
				midlLetter += j;
				matrix[i][j] = "" + firstLastletter + midlLetter + firstLastletter;
				midlLetter -= j;
			}
			midlLetter = 'a';
			firstLastletter = 'a';
		}

		return matrix;

	}

	public static void printMatrix(String[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]).replaceAll(",|\\[|\\]", ""));
		}

	}

}
