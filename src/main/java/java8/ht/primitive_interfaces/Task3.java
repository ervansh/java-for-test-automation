package java8.ht.primitive_interfaces;

import java.util.Random;
import java.util.function.IntSupplier;

public class Task3 {

	public static void main(String[] args) {
		// Write a IntSupplier to give random int below 5000

		IntSupplier randomintsupplier = () -> {
			Random random = new Random();
			return random.nextInt(5000);
		};

		System.out.println(randomintsupplier.getAsInt());
	}

}
