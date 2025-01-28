package collectionsHT;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1_ArrayList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfLines = scanner.nextInt();
		ArrayList<ArrayList<Integer>> data = new ArrayList<>();

		for (int i = 0; i < numberOfLines; i++) {
			int numCount = scanner.nextInt();
			ArrayList<Integer> list = new ArrayList<>();

			for (int j = 0; j < numCount; j++) {
				list.add(scanner.nextInt());
			}

			data.add(list);
		}

		int numberOfQueries = scanner.nextInt();

		for (int i = 0; i < numberOfQueries; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			if (x <= data.size() && y <= data.get(x - 1).size()) {
				System.out.println(data.get(x - 1).get(y - 1));
			} else {
				System.out.println("ERROR!");
			}
		}

		scanner.close();
	}
}
