package collectionsHT;

import java.util.HashMap;
import java.util.Scanner;

public class Task3_Map {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of phone book entries");
		int num = scanner.nextInt();
		scanner.nextLine();

		HashMap<String, String> phonebook = new HashMap<>();

		for (int i = 0; i < num; i++) {
			System.out.println("Enter name...");
			String name = scanner.nextLine();
			System.out.println("Enter number...");
			String phonenumber = scanner.nextLine();
			phonebook.put(name, phonenumber);
		}

		System.out.println("Enter query...");
		String query = scanner.nextLine(); // enter name to find phone number
		if (phonebook.containsKey(query)) {
			String q = phonebook.get(query);
			System.out.println(query+" = "+q);
		}else {
			System.out.println("Does not exists.");
		}
		scanner.close();
	}

}
