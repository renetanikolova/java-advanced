package lab1;

import java.util.Scanner;

public class ModifyABitV2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int p = input.nextInt();
		int v = input.nextInt();

		if (v == 0) {
			System.out.println(~(1 << p) & n);
		} else if (v == 1) {
			System.out.println((1 << p) | n);
		}

	}

}
