package java8.ht.bifunctionalinterfaces;

import java.util.function.BiFunction;

import java8.ht.predicates.Product;

public class Task1 {

	public static void main(String[] args) {

		BiFunction<String, Integer, Product> newproduct = (a, b) -> {

			return new Product(a, b, "", "");
		};

		Product product = newproduct.apply("Printer", 10000);
		System.out.println(product);
	}

}
