package lab1;

import java.util.Scanner;

public class HitTheTarget {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		for (int i = 1; i < 21; i++) {
			for (int j = 1; j < 21; j++) {
				if (i + j == n) {
					System.out.printf("%d + %d = %d%n", i, j, n);
				}
				if (i - j == n) {
					System.out.printf("%d - %d = %d%n", i, j, n);
				}
			}
		}

	}

}
