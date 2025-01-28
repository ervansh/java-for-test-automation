package java8.ht.primitive_interfaces;

import java.util.function.IntConsumer;

public class Task2 {

	public static void main(String[] args) {
		// Problem: Write an IntConsumer to print square of the given number

		IntConsumer square = e ->{
			System.out.println("Square of the number is : "+ e*e);
		};
		
		square.accept(10);
	}

}
