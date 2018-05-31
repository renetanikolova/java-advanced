package lab1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameOfNamespackage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = Integer.parseInt(input.nextLine());
		Map<String, Integer> players = new HashMap<>();
		String playerName = "";
		int scores = 0;
		long playerScores = 0;

		for (int i = 0; i < n; i++) {
			playerName = input.nextLine();
			scores = Integer.parseInt(input.nextLine());
			playerScores = scores;

			for (int j = 0; j < playerName.length(); j++) {
				if ((int) playerName.charAt(j) % 2 == 0) {
					playerScores += (int) playerName.charAt(j);
				} else {
					playerScores -= (int) playerName.charAt(j);
				}
			}
			players.put(playerName, (int) playerScores);
		}

		Map.Entry<String, Integer> firstPlayer = players.entrySet().iterator().next();
		int largestKey = firstPlayer.getValue();
		String largestKeyValue = firstPlayer.getKey();

		for (Map.Entry<String, Integer> player : players.entrySet()) {
			int key = player.getValue();
			if (key > largestKey) {
				largestKey = key;
				largestKeyValue = player.getKey();
			}
		}

		System.out.printf("The winner is %s - %d points", largestKeyValue, largestKey);
	}

}
