package lab1;

import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double quantity = input.nextDouble();

		quantity = quantity * 1.20;

		BigDecimal price = new BigDecimal(quantity).multiply(new BigDecimal(4210500000000.00));

		System.out.printf("%.2f marks", price);

	}

}
