package lab1;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String a = input.next();
		String b = input.next();

		BigDecimal area = BigDecimal.ONE;
		area = (new BigDecimal(a)).multiply(new BigDecimal(b));

		NumberFormat formatter = new DecimalFormat("#0.00");
		System.out.println(formatter.format(area));

	}

}
