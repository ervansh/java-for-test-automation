package coreJavaHT_LanguageConstruct;

public class Task10 {
	public static void main(String[] args) {
		String input = "7 11";
		int sum = sumNumbers(input);
		System.out.println("The sum of numbers in the string is: " + sum);
	}

	public static int sumNumbers(String str) {
		int sum = 0;
		StringBuilder temp = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			// Check if the current character is a digit
			if (Character.isDigit(currentChar)) {
				// Accumulate the number in a temporary string
				temp.append(currentChar);
			} else {
				// If it's not a digit and the temporary string has a number
				if (temp.length() > 0) {
					// Convert the temporary string to a number and add it to the sum
					sum += Integer.parseInt(temp.toString());
					// Reset the temporary string
					temp = new StringBuilder();
				}
			}
		}

		// To handle the last number in case the string ends with digits
		if (temp.length() > 0) {
			sum += Integer.parseInt(temp.toString());
		}

		return sum;
	}
}
