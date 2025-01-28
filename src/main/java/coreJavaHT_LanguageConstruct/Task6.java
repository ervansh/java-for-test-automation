package coreJavaHT_LanguageConstruct;

public class Task6 {
	public static void main(String[] args) {
		System.out.println("shareDigit(12, 23) ? " + shareDigit(12, 23));
		System.out.println("shareDigit(12, 43) ? " + shareDigit(12, 43));
		System.out.println("shareDigit(12, 44) ? " + shareDigit(12, 44));
	}

	public static boolean shareDigit(int a, int b) {
		// Extract digits from both numbers
		int aLeft = a / 10;
		int aRight = a % 10;
		int bLeft = b / 10;
		int bRight = b % 10;

		// Check if any digit from 'a' matches any digit from 'b'
		return (aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight);
	}
}
