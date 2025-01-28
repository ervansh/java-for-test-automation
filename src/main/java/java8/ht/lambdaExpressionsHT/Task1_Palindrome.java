package java8.ht.lambdaExpressionsHT;

import java.util.function.Predicate;

public class Task1_Palindrome {
	public static void main(String[] args) {
		// Using lambda exp
		Predicate<String> isPalindrome = s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());

		System.out.println("Is given string palindrome ? " + isPalindrome.test("racecar"));
	}

	/**
	 * public static boolean isPalindrome(int number) { int reverse = 0; int
	 * originalnumber = number;
	 * 
	 * while (number > 0) { int lastdigit = number % 10; reverse = reverse * 10 +
	 * lastdigit; number = number / 10; } if(originalnumber == reverse) { return
	 * true; } return false; }
	 */
}
