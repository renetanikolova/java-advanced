package lab1;

import java.util.Scanner;

public class TransportPrice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		input.nextLine();

		String dayNight = input.nextLine();
		double travelledSum = 0.0;

		if (n < 20) {
			travelledSum = 0.70;
			if (dayNight.equals("day")) {
				travelledSum += (n * 0.79);
			} else if (dayNight.equals("night")) {
				travelledSum += (n * 0.90);
			}
		} else if (n < 100) {
			travelledSum = n * 0.09;
		} else if (n >= 100) {
			travelledSum = n * 0.06;
		}

		System.out.printf("%.2f", travelledSum);

	}

}
