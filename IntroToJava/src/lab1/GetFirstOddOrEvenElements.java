package lab1;

import java.util.Scanner;

public class GetFirstOddOrEvenElements {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] elements = input.nextLine().split("\\s+");
		String[] secondLine = input.nextLine().split("\\s+");
		int n = Integer.parseInt(secondLine[1]);

		String output = "";

		for (int i = 0; i < elements.length; i++) {
			if (secondLine[2].equals("even")) {
				if (Integer.parseInt(elements[i]) % 2 == 0 && n > 0) {
					output += elements[i] + " ";
					n--;
				}
			} else if (secondLine[2].equals("odd")) {
				if (Integer.parseInt(elements[i]) % 2 != 0 && n > 0) {
					output += elements[i] + " ";
					n--;
				}
			}
		}

		System.out.println(output);
	}

}
