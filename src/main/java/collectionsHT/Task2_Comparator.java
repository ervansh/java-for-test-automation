package collectionsHT;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_Comparator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberofinput = scanner.nextInt();
		Player[] players = new Player[numberofinput];

		Checker checker = new Checker();

		for (int i = 0; i < numberofinput; i++) {
			String name = scanner.next();
			int score = scanner.nextInt();
			players[i] = new Player(name, score);
		}

		Arrays.sort(players, checker);
		Arrays.asList(players).stream().forEach(e -> System.out.println(e));
		scanner.close();
	}
}
