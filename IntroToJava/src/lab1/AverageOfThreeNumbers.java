package lab1;

import java.util.Scanner;

public class AverageOfThreeNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double sum = 0;

		for (int i = 0; i < 3; i++) {
			sum += input.nextDouble();
		}

		sum /= 3;

		System.out.printf("%.2f", sum);

	}

}
