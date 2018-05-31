package lab1;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String line1 = input.nextLine();
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			sum += input.nextInt();
		}

		String lastLine = input.next();

		System.out.printf("%s %s %s", line1, lastLine, sum);

	}

}
