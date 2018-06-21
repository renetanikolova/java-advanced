package lab;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceInMatrix {

	static String[][] matrix;
	static int maxCounter;
	static int currCounter;
	static String word;

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		String[] lineRowCol = input.nextLine().split("\\s++");

		int r = Integer.parseInt(lineRowCol[0]);
		int c = Integer.parseInt(lineRowCol[1]);

		matrix = new String[r][c];
		maxCounter = 1;
		currCounter = 1;
		word = "";
		String[] line = new String[c];

		// get input
		for (int i = 0; i < r; i++) {
			line = input.nextLine().split(" ");
			for (int j = 0; j < c; j++) {
				matrix[i][j] = line[j];
			}
		}

		findSequaltials(matrix);

	}

	public static void findSequaltials(String[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				findSequence("diagonal-right", i, j);
				findSequence("down", i, j);
			}
		}

		for (int i = 0; i < maxCounter; i++) {
			if (i != maxCounter - 1) {
				System.out.printf("%s, ", word);
			} else {
				System.out.printf("%s", word);
			}
		}

	}

	static void findSequence(String direction, int currI, int currJ) {

		if (currCounter >= maxCounter) {
			maxCounter = currCounter;
			word = matrix[currI][currJ];
		}

		// diagonal - right
		if (direction.equals("diagonal-right") && elementsInBounds(currI + 1, currJ + 1)) {
			if (matrix[currI][currJ].equals(matrix[currI + 1][currJ + 1])) {
				currCounter++;
				findSequence(direction, currI + 1, currJ + 1);
			}
		} else if (direction.equals("down") && elementsInBounds(currI + 1, currJ)) { // down
			if (matrix[currI][currJ].equals(matrix[currI + 1][currJ])) {
				currCounter++;
				findSequence(direction, currI + 1, currJ);
			}
		}
		currCounter = 1;

	}

	static boolean elementsInBounds(int i, int j) {
		if (i < matrix.length && j < matrix[0].length && i >= 0 && j >= 0) {
			return true;
		}
		return false;
	}

}
