package coreJavaHT_basics;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double result = 0;
		boolean valid = true;

		System.out.print("Enter first number: ");
		double number1 = scanner.nextDouble();

		System.out.print("Enter second number: ");
		double number2 = scanner.nextDouble();

		System.out.print("Enter operation: ");
		String operation = scanner.next();

		switch (operation) {
		case "+":
			result = number1 + number2;
			break;
		case "-":
			result = number1 - number2;
			break;
		case "*":
			result = number1 * number2;
			break;
		case "/":
			if (number2 == 0) {
				System.out.println("Error: Division by zero.");
				valid = false;
			} else {
				result = number1 / number2;
			}
			break;
		}

		if (valid) {
			System.out.println("Result of " + number1 + " " + operation + " " + number2 + " = " + result);
		}

		scanner.close();
	}
}
