package lab;

import java.util.Scanner;

public class TraingleArea {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double base = input.nextDouble();
		double height = input.nextDouble();

		System.out.printf("Area = %.2f", calculateTriangleArea(base, height));

	}

	private static double calculateTriangleArea(double base, double height) {

		return base * height / 2;

	}

}
