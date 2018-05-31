package lab1;

import java.util.Scanner;

public class ExtractBitFromInteger {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int p = input.nextInt();
		String binaryNumber = "";

		while (n != 0) {
			binaryNumber = n % 2 + binaryNumber;
			n = n / 2;
		}

		// binaryNumber = Integer.toBinaryString(n);

		binaryNumber = ("0000000000000000" + binaryNumber).substring(binaryNumber.length());

		System.out.println(binaryNumber.charAt(16 - p - 1));

	}

}
