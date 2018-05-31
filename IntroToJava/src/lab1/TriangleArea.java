package lab1;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] line1 = input.nextLine().replaceAll("\\s+", " ").split(" ");
		String[] line2 = input.nextLine().replaceAll("\\s+", " ").split(" ");
		String[] line3 = input.nextLine().replaceAll("\\s+", " ").split(" ");

		long area = 1;

		area = Integer.parseInt(line1[0]) * (Integer.parseInt(line2[1]) - Integer.parseInt(line3[1]))
				+ Integer.parseInt(line2[0]) * (Integer.parseInt(line3[1]) - Integer.parseInt(line1[1]))
				+ Integer.parseInt(line3[0]) * (Integer.parseInt(line1[1]) - Integer.parseInt(line2[1]));
		area /= 2;

		System.out.println(Math.abs(area));

	}

}
