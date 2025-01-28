package java8.ht.bifunctionalinterfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiFunction;

import java8.ht.predicates.Product;

public class Task2 {

	public static void main(String[] args) {

		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product("Pen", 10, "stationary", "A"));
		productlist.add(new Product("Dell Lattitude", 40000, "Electronics", "L"));
		productlist.add(new Product("Mouse", 1500, "Electronics", "M"));

		HashMap<Product, Integer> cart = new HashMap<>();

		cart.put(new Product("Pen", 10, "stationary", "A"), 50);
		cart.put(new Product("Dell Lattitude", 40000, "Electronics", "L"), 5);
		cart.put(new Product("Mouse", 1500, "Electronics", "M"), 10);

		BiFunction<Product, Integer, Integer> calculatecost = (product, quantity) -> {
			return product.getPrice() * quantity;
		};

		System.out.println("************* Product wise cost *********************");
		cart.entrySet().forEach(entry -> {
			Integer costofproducts;
			costofproducts = calculatecost.apply(entry.getKey(), entry.getValue());
			System.out.println(costofproducts);

		});

		System.out.println("************* Cart cost *********************");
		 int cartcost = cart.entrySet().stream().mapToInt(entry -> calculatecost.apply(entry.getKey(), entry.getValue())).sum();
		System.out.println(cartcost);
	}

}
