package lab;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectCoins {

	static int coins;
	static int walls;
	static ArrayList<String[]> matrix;
	static ArrayList<Boolean[]> isVisited;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] movementCommands = null;
		String line = "";
		matrix = new ArrayList<>();
		isVisited = new ArrayList<>();
		coins = 0;
		walls = 0;

		for (int i = 0; i < 4; i++) {
			line = input.nextLine();
			matrix.add(line.split(""));
			isVisited.add(new Boolean[matrix.get(i).length]);
		}

		movementCommands = input.nextLine().split("");

		collectCoinsAndWalls(movementCommands);

		System.out.printf("Coins = %d%nWalls = %d%n", coins, walls);
	}

	static void collectCoinsAndWalls(String[] moveCommands) {

		int currI = 0, currJ = 0;

		for (int i = 0; i < moveCommands.length; i++) {
			if (moveCommands[i].equals(">")) {
				if (inBounds(currI, currJ + 1)) {
					currJ++;
					if (matrix.get(currI)[currJ].equals("$") && isVisited.get(currI)[currJ] == null) {
						coins++;
						isVisited.get(currI)[currJ] = true;
					}
				} else {
					walls++;
				}
			}
			if (moveCommands[i].equals("<")) {
				if (inBounds(currI, currJ - 1)) {
					currJ--;
					if (matrix.get(currI)[currJ].equals("$") && isVisited.get(currI)[currJ] == null) {
						coins++;
						isVisited.get(currI)[currJ] = true;
					}
				} else {
					walls++;
				}
			}
			if (moveCommands[i].equals("V")) {
				if (inBounds(currI + 1, currJ)) {
					currI++;
					if (matrix.get(currI)[currJ].equals("$") && isVisited.get(currI)[currJ] == null) {
						coins++;
						isVisited.get(currI)[currJ] = true;
					}
				} else {
					walls++;
				}
			}
			if (moveCommands[i].equals("^")) {
				if (inBounds(currI - 1, currJ)) {
					currI--;
					if (matrix.get(currI)[currJ].equals("$") && isVisited.get(currI)[currJ] == null) {
						coins++;
						isVisited.get(currI)[currJ] = true;
					}
				} else {
					walls++;
				}
			}
		}

	}

	static boolean inBounds(int i, int j) {
		if (i >= 0 && i < matrix.size() && j < matrix.get(i).length && j >= 0) {
			return true;
		}
		return false;
	}

}
