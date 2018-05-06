package lab1;

import java.util.Scanner;

public class CalculateExpression {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double f1 = (Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2));
		f1 = Math.pow(f1, (a + b + c) / Math.sqrt(c));

		double f2 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)), (a - b));

		double result = Math.abs(avg(new double[] { a, b, c }) - avg(new double[] { f1, f2 }));

		System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, result);

	}

	private static double avg(double[] params) {

		double result = 0;

		for (double d : params) {
			result += d;
		}

		result /= params.length;

		return result;
	}

}
