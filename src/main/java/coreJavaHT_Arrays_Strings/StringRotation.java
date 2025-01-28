package coreJavaHT_Arrays_Strings;

public class StringRotation {

	public static void main(String[] args) {
		String s1 = "ABCDEF";
		String s2 = "DEFCAB";

		boolean result = areRotations(s1, s2);
		System.out.println(result);
		if (result) {
			System.out.println("Strings are rotation of each other.");
		} else {
			System.out.println("Strings are not rotation of each other.");
		}

	}

	public static boolean areRotations(String str1, String str2) {
		// Check if strings are null or lengths are different, which means they cannot
		// be rotations of each other
		if (str1 == null || str2 == null || str1.length() != str2.length()) {
			return false;
		}

		// Concatenate str1 with itself
		String str1Concat = str1 + str1;
		System.out.println(str1Concat);
		// Check if str2 is a substring of str1Concat
		return str1Concat.contains(str2);
	}

}
