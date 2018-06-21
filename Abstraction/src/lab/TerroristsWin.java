package lab;

import java.util.Scanner;

public class TerroristsWin {

	static int bombPower;
	static String bombInput;

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		bombInput = input.nextLine();
		bombPower = 0;
		int counter = 0;

		// get input
		for (int i = 0; i < bombInput.length(); i++) {
			if (bombInput.charAt(i) == '|' || counter > 0) {
				counter++;
				if (bombInput.charAt(i) == '|' && counter > 1) {
					getBombPower(i, counter);
					counter = 0;
				}
			}
		}

		System.out.println(bombInput);

	}

	static void getBombPower(int lastI, int counter) {
		long charCounter = 0;

		for (int j = lastI - counter + 2; j < lastI; j++) {
			charCounter += (int) bombInput.charAt(j);
		}
		bombPower = (int) charCounter % 10;
		bombExplode(lastI, counter);
	}

	static void bombExplode(int lastI, int counter) {
		// lastI(the position where is the last '|') - counter - bombPower + 1
		// currI marks where the '.' should start
		int currI = lastI - counter - bombPower + 1;
		for (int j = 0; j < bombInput.length(); j++) {
			if (j >= currI && j < currI + counter + (2 * bombPower)) {
				bombInput = bombInput.substring(0, j) + "." + bombInput.substring(j + 1, bombInput.length());
			}
		}
	}

}
