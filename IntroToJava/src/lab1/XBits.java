package lab1;

import java.util.Scanner;

public class XBits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] inputNumbers = new int[8];
		int[][] binaryMatrix = new int[32][32];

		for (int i = 0; i < 8; i++) {
			inputNumbers[i] = input.nextInt();
			binaryMatrix[i] = decimalToBinary(inputNumbers[i]);
		}

		System.out.println(findXbits(binaryMatrix));

	}

	private static int findXbits(int[][] matrix) {

		int countXBits = 0;

		for (int i = 0; i < matrix.length - 2; i++) {
			for (int j = 0; j < matrix[i].length - 2; j++) {
				if (matrix[i][j] == 1 && matrix[i][j + 1] == 0 && matrix[i][j + 2] == 1) {
					if (matrix[i + 1][j] == 0 && matrix[i + 1][j + 1] == 1 && matrix[i + 1][j + 2] == 0) {
						if (matrix[i + 2][j] == 1 && matrix[i + 2][j + 1] == 0 && matrix[i + 2][j + 2] == 1) {
							countXBits++;
						}
					}
				}
			}
		}
		return countXBits;
	}

	private static int[] decimalToBinary(int num) {

		int[] result = new int[32];
		int i = result.length - 1;

		while (num != 0) {
			result[i] = num % 2;
			num /= 2;
			i--;
		}

		return result;

	}

}
