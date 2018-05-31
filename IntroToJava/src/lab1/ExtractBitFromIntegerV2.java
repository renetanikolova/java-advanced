package lab1;

import java.util.Scanner;

public class ExtractBitFromIntegerV2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int p = input.nextInt();

		System.out.println((n >> p) & 1);

	}

}
