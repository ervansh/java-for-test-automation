package coreJavaHT_LanguageConstruct;

public class Task2 {

	/**
	 * Problem statement: 
	 * The number 6 is a truly great number. Given two int
	 * values, a and b, return true if either one is 6. Or if their sum or
	 * difference is 6. Note: the function Math.abs(num) computes the absolute value
	 * of a number.
	 */
	
	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		boolean result = isGreatNumber(a, b);
		System.out.println("Is it a great number? " + result);
	}

	public static boolean isGreatNumber(int a, int b) {
		return a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6;
	}
}
