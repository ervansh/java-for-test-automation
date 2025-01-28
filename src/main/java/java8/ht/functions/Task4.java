package java8.ht.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import java8.ht.predicates.Product;

public class Task4 {

	public static void main(String[] args) {
		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product("Pen", 10, "stationary", "A"));
		productlist.add(new Product("Dell Lattitude", 40000, "Electronics", "L"));
		productlist.add(new Product("Mouse", 1500, "Electronics", "M"));

		Function<ArrayList<Product>, List<String>> totalcostfunction = p -> {
			List<String> nameslist = new ArrayList<String>();
			for (Product product : p) {
				if (product.getPrice()>1000 && product.getCategory() == "Electronics") {
					nameslist.add(product.getName());
				}
			}
			return nameslist;
		};

		List<String> productnameslist = totalcostfunction.apply(productlist);
		System.out.println("Total cost of the products is : " + productnameslist);

	}

}
