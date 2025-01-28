package collectionsHT;

import java.util.Scanner;
import java.util.Stack;

public class Task4_Stack {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input...");
		while (scanner.hasNextLine()) {
			String input = scanner.nextLine();
			System.out.println(isBalanced(input));
		}
		// scanner.close();
	}

	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
}
