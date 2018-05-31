package lab1;

import java.util.Scanner;

public class ModifyABit {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int p = input.nextInt();
		char v = input.next().charAt(0);

		String binaryNumber = "";

		// decimal to binary
		while (n != 0) {
			binaryNumber = n % 2 + binaryNumber;
			n /= 2;
		}

		binaryNumber = ("0000000000000000" + binaryNumber).substring(binaryNumber.length());

		binaryNumber = binaryNumber.substring(0, 15 - p) + v + binaryNumber.substring(16 - p, binaryNumber.length());

		int output = 0;

		// binary to decimal
		for (int i = 0; i < binaryNumber.length(); i++) {
			if (binaryNumber.charAt(i) == '1') {
				output += Math.pow(2, binaryNumber.length() - i - 1);
			}
		}

		System.out.println(output);
	}

}
