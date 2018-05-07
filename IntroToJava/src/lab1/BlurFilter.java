package lab1;

import java.util.Scanner;

public class BlurFilter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int blurAmount = input.nextInt();

		int r = input.nextInt();
		int c = input.nextInt();

		long[][] matrix = new long[r][c];

		String[] line = new String[c];
		line = input.nextLine().split("\\s+");

		for (int i = 0; i < r; i++) {
			line = input.nextLine().split("\\s+");
			for (int j = 0; j < line.length; j++) {
				matrix[i][j] = Integer.parseInt(line[j]);
			}
		}

		int blurCoordinateI = input.nextInt();
		int blurCoordinateJ = input.nextInt();

		int startI = 0;
		int endI = 0;
		int startJ = 0;
		int endJ = 0;

		if (blurCoordinateI == 0) {
			endI = 1;
		} else if (blurCoordinateI == r - 1) {
			startI = blurCoordinateI - 1;
			endI = blurCoordinateI;
		} else {
			startI = blurCoordinateI - 1;
			endI = blurCoordinateI + 1;
		}

		if (blurCoordinateJ == 0) {
			endJ = 1;
		} else if (blurCoordinateJ == c - 1) {
			startJ = blurCoordinateJ - 1;
			endJ = blurCoordinateJ;
		} else {
			startJ = blurCoordinateJ - 1;
			endJ = blurCoordinateJ + 1;
		}

		if (blurCoordinateI == 0 && blurCoordinateJ == 0 && matrix.length == 1 && matrix[blurCoordinateI].length == 1) {
			startI = 0;
			endI = 0;
			startJ = 0;
			endJ = 0;
		}

		for (int i = startI; i < endI + 1; i++) {
			for (int j = startJ; j < endJ + 1; j++) {
				matrix[i][j] += blurAmount;
			}
		}

		output(matrix);

	}

	private static void output(long[][] matrix) {

		for (long[] is : matrix) {
			for (long i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
