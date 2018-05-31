package lab1;

import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();

		String[] hexadecimalSystem = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		String hexadecimalNumber = "";
		String binaryNumber = "";

		int aCopy = a;

		hexadecimalNumber = aCopy == 0 ? "0" : "";

		while (aCopy != 0) {
			hexadecimalNumber = hexadecimalSystem[aCopy % 16] + hexadecimalNumber;
			aCopy /= 16;
		}

		while (a != 0) {
			binaryNumber = a % 2 + binaryNumber;
			a /= 2;
		}

		String bOutput = String.format("%.2f", b);
		String cOutput = String.format("%.3f", c);

		System.out.print("|" + hexadecimalNumber);
		System.out.print("          ".substring(hexadecimalNumber.length()));
		System.out.print("|" + ("0000000000" + binaryNumber).substring(binaryNumber.length()));
		System.out.print("|" + ("          " + bOutput).substring(bOutput.length()));
		System.out.print("|" + cOutput);
		System.out.print(("          ").substring(cOutput.length()) + "|");

	}

}
