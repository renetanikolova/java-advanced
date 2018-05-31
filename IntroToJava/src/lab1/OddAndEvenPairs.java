package lab1;

import java.util.Scanner;

public class OddAndEvenPairs {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] line = input.nextLine().split("\\s+");

		if (line.length % 2 != 0) {
			System.out.println("invalid length");
			return;
		}

		for (int i = 0; i < line.length; i += 2) {
			if (checkIfEven(Integer.parseInt(line[i]), Integer.parseInt(line[i + 1]))) {
				System.out.printf("%s, %s -> both are even%n", line[i], line[i+1]);
			} else if (chechIfOdd(Integer.parseInt(line[i]), Integer.parseInt(line[i + 1]))) {
				System.out.printf("%s, %s -> both are odd%n", line[i], line[i+1]);
			} else {
				System.out.printf("%s, %s -> different%n", line[i], line[i+1]);
			}

		}

	}

	private static boolean chechIfOdd(int num1, int num2) {

		return num1 % 2 == 1 && num2 % 2 == 1;
	}

	private static boolean checkIfEven(int num1, int num2) {

		return num1 % 2 == 0 && num2 % 2 == 0;
	}

}
