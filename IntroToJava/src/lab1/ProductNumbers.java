package lab1;

import java.math.BigInteger;
import java.util.Scanner;

public class ProductNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();

		int i = n;
		BigInteger product = new BigInteger("1");

		do {
			product = product.multiply(BigInteger.valueOf(i));
			i++;
		} while (i <= m);

		System.out.printf("product[%d..%d] = %s", n, m, product);

	}

}
