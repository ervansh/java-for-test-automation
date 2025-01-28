package java8.ht.lambdaExpressionsHT;

import java.util.function.BiPredicate;

public class Task3_StringRotations {
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";

		BiPredicate<String, String> rotations = (s1, s2) -> s1.length() == s2.length() && (s1 + s1).contains(s2);

		System.out.println("Are str1 and str2 rotational ? " + rotations.test(str1, str2));
	}

	/**
	 * public static boolean isStringRotation(String s1, String s2) { if
	 * (s1.length() == s2.length() && (s1 + s1).contains(s2)) { return true; }
	 * return false; }
	 */
}
