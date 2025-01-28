package java8.ht.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Task1 {

	public static void main(String[] args) {

		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product("Pen", 10, "stationary", "A"));
		productlist.add(new Product("Dell Lattitude", 40000, "Laptop", "L"));
		productlist.add(new Product("Mouse", 1500, "Accessories", "M"));

		// productlist.stream().forEach(e -> System.out.println(e));

		Predicate<Product> predicate = e -> e.getPrice() > 1000;

		productlist.stream().filter(predicate).forEach(p -> System.out.println(p));
	}

}
