package lab1;

import java.util.Scanner;

public class CharacterMultiplier {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String str1 = input.next();
		String str2 = input.next();

		if (str1.length() < str2.length()) {
			calculation(str1, str2);
		} else if (str1.length() > str2.length()) {
			calculation(str2, str1);
		} else {
			calculation(str1, str2);
		}

	}

	public static void calculation(String shorterStr, String longerStr) {

		long result = 0;

		for (int i = 0; i < shorterStr.length(); i++) {
			result += ((int) shorterStr.charAt(i) * (int) longerStr.charAt(i));
		}

		if (shorterStr.length() != longerStr.length()) {
			for (int j = shorterStr.length(); j < longerStr.length(); j++) {
				result += (int) longerStr.charAt(j);
			}
		}

		System.out.println(result);
	}

}
