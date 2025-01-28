package javaprogram.practice;

import java.util.Arrays;
import java.util.List;

public class P1 {
	public static void main(String[] args) {
		
		  List<String> list = Arrays.asList("Bharath", "Bob", "Bharath", "Vanshraj","Tom", "Harry"); 
		  long count = list.stream().filter(e -> e.startsWith("B")).count(); 
		  System.out.println(count);
		 

		System.out.println(test());
	}

	private static int test() {

		int i = 0;

		try {

			i++;

			throw new NullPointerException();

		} catch (NullPointerException ex) {

			return i++;

		} finally {
			return ++i;
		}

	}
}
