package lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		BigDecimal[][] bdArray = new BigDecimal[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (i == 0 || j == 0 || j == i) {
					bdArray[i][j] = BigDecimal.ONE;
				} else if (j == 1 || j == i - 1) {
					bdArray[i][j] = BigDecimal.valueOf(i);
				} else {
					bdArray[i][j] = (bdArray[i - 1][j - 1].add(bdArray[i - 1][j]));
				}
			}
		}

		printArray(bdArray);

	}

	private static void printArray(BigDecimal[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
