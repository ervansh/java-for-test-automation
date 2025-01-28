package coreJavaHT_Arrays_Strings;

import java.util.HashSet;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		String str = "programming";

		HashSet<Character> set = new HashSet<Character>();
		char[] c = str.toCharArray();
		for (char d : c) {
			Character ch = Character.valueOf(d);
			if (!set.add(ch)) {
				System.out.println("Duplicate character is : " + ch);
			}
		}

	}

}
