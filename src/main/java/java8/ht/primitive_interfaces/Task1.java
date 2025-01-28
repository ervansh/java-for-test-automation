package java8.ht.primitive_interfaces;

import java.util.function.IntPredicate;

public class Task1 {

	public static void main(String[] args) {
		
		//Problem: Write an IntPredicate to verify if the given number is a primenumber
		
		IntPredicate intpr = n -> {
			return n%2==0;
		};
		
		boolean t = intpr.test(10);
		if(t) {
			System.out.println("Number is prime.");
		} else {
			System.out.println("Number is not prime.");
		}

	}

}
