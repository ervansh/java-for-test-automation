package java8.ht.streams;

import java.util.ArrayList;

import java8.ht.predicates.Product;

public class Task3 {

	public static void main(String[] args) {
		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product("Pen", 10, "stationary", "A"));
		productlist.add(new Product("Dell Lattitude", 40000, "Electronics", "L"));
		productlist.add(new Product("Mouse", 1500, "Accessories", "M"));

		productlist.stream().filter(e -> e.getCategory() == "Electronics" && e.getPrice() > 1000)
				.map(p -> p.getName().toUpperCase()).forEach(e -> System.out.println(e));

	}

}
