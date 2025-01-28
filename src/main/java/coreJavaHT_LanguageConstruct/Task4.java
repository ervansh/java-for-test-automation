package coreJavaHT_LanguageConstruct;

public class Task4 {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		int c = 3;

		int result = evaluateLotteryTicket(a, b, c);
		System.out.println("Lottery ticket result: " + result);
	}

	public static int evaluateLotteryTicket(int a, int b, int c) {
		int ab = a + b;
		int bc = b + c;
		int ac = a + c;

		// Check if any pair sums to exactly 10
		if (ab == 10 || bc == 10 || ac == 10) {
			return 10;
		}

		// Check if ab sum is exactly 10 more than either bc or ac sums
		if (ab - bc == 10 || ab - ac == 10) {
			return 5;
		}

		// Otherwise, return 0
		return 0;
	}
}
