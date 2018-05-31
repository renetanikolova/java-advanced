package lab1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VehiclePark {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] vehicles = input.nextLine().split("\\s+");
		ArrayList<String> vehiclesLeft = new ArrayList<>(Arrays.asList(vehicles));
		ArrayList<String> vehiclesSold = new ArrayList<>();

		String line = "";

		while (!(line = input.nextLine()).equals("End of customers!")) {
			boolean isSold = false;
			String[] request = line.split("\\s+");

			for (int i = 0; i < vehicles.length; i++) {

				if ((int) request[0].charAt(0) + 32 == (int) vehicles[i].charAt(0) && !vehiclesLeft.isEmpty()) {
					if (Integer.parseInt(request[2]) == Integer.parseInt(vehicles[i].substring(1, vehicles[i].length()))
							&& vehiclesLeft.contains(vehicles[i])) {
						System.out.printf("Yes, sold for %d$%n",
								sellPrice((int) vehicles[i].charAt(0), Integer.parseInt(request[2])));
						vehiclesSold.add(vehicles[i]);
						vehiclesLeft.remove(vehicles[i]);
						isSold = true;
						break;
					}
				}
			}
			if (isSold == false) {
				System.out.println("No");
			}

		}

		System.out.printf("Vehicles left: %s%n", vehiclesLeft.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
		System.out.printf("Vehicles sold: %d%n", vehiclesSold.size());

	}

	private static int sellPrice(int charValue, int numberSeats) {
		return charValue * numberSeats;
	}

}
