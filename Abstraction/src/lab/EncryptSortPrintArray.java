package lab;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrintArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = Integer.parseInt(input.nextLine());
		String[] names = new String[n];
		long[] encryptedArray = new long[n];

		for (int i = 0; i < n; i++) {
			names[i] = input.nextLine();
			encryptedArray[i] = encryptName(names[i]);
		}

		Arrays.sort(encryptedArray);

		for (long number : encryptedArray) {
			System.out.println(number);
		}

	}

	private static long encryptName(String name) {

		long encryptNumber = 0;

		for (int i = 0; i < name.length(); i++) {
			if (Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').contains(name.charAt(i))) {
				encryptNumber += (int) name.charAt(i) * name.length();
			} else {
				encryptNumber += (int) name.charAt(i) / name.length();
			}

		}

		return encryptNumber;

	}
}
