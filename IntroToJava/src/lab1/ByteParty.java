package lab1;

import java.util.Scanner;
import java.util.stream.Stream;

public class ByteParty {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[] eightBitArray = new int[n];
		String[] binaryArray = new String[n];

		for (int i = 0; i < n; i++) {
			eightBitArray[i] = input.nextInt();
			binaryArray[i] = convertToBinary(eightBitArray[i]);
		}

		String line = input.nextLine();

		while (!(line = input.nextLine()).equals("party over")) {
			String[] commands = line.split("\\s+");
			if (commands[0].equals("-1")) {
				for (int k = 0; k < n; k++) {
					if (binaryArray[k].charAt(binaryArray[k].length() - 1 - Integer.parseInt(commands[1])) == '1') {

						binaryArray[k] = changeBitValue(binaryArray, k, commands, '0');

					} else {

						binaryArray[k] = changeBitValue(binaryArray, k, commands, '1');
					}
				}

			} else if (commands[0].equals("0")) {
				for (int k = 0; k < n; k++) {
					binaryArray[k] = changeBitValue(binaryArray, k, commands, '0');
				}
			} else if (commands[0].equals("1")) {
				for (int k = 0; k < n; k++) {
					binaryArray[k] = changeBitValue(binaryArray, k, commands, '1');
				}
			}
		}

		Stream.of(binaryArray).forEach(binary -> convertToDecimal(binary));

	}

	private static String changeBitValue(String[] binaryArray, int k, String[] commands, char c) {

		return binaryArray[k].substring(0, binaryArray[k].length() - 1 - Integer.parseInt(commands[1])) + c
				+ binaryArray[k].substring(binaryArray[k].length() - Integer.parseInt(commands[1]),
						binaryArray[k].length());
	}

	private static String convertToBinary(int num) {

		String result = "";

		while (num != 0) {
			result = num % 2 + result;
			num /= 2;
		}

		return ("00000000" + result).substring(result.length());
	}

	private static void convertToDecimal(String binaryArray) {

		int decimal = 0;

		for (int i = 0; i < binaryArray.length(); i++) {
			if (binaryArray.charAt(i) == '1') {
				decimal += Math.pow(2, binaryArray.length() - i - 1);
			}
		}

		System.out.println(decimal);
	}

}
