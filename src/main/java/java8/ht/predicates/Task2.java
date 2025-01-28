package java8.ht.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Task2 {
	public static void main(String[] args) {

		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product("Pen", 10, "stationary", "A"));
		productlist.add(new Product("Dell Lattitude", 40000, "Electronics", "L"));
		productlist.add(new Product("Mouse", 1500, "Electronics", "M"));

		// productlist.stream().forEach(e -> System.out.println(e));

		Predicate<Product> predicate = e -> e.getCategory() == "Electronics";

		productlist.stream().filter(predicate).forEach(p -> System.out.println(p));
	}
}
