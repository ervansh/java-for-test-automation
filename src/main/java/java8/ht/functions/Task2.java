package java8.ht.functions;

import java.util.ArrayList;
import java.util.function.Function;

import java8.ht.predicates.Product;

public class Task2 {

	public static void main(String[] args) {

		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product("Pen", 10, "stationary", "A"));
		productlist.add(new Product("Dell Lattitude", 40000, "Laptop", "L"));
		productlist.add(new Product("Mouse", 900, "Accessories", "M"));

		Function<ArrayList<Product>, Integer> totalcostfunction = p -> {
			int totalcost = 0;
			for (Product product : p) {
				if(product.getPrice()>1000) {
					totalcost += product.getPrice();
				}
			}
			return totalcost;
		};

		Integer totalcostofproducts = totalcostfunction.apply(productlist);
		System.out.println("Total cost of the products is : " + totalcostofproducts);

	}

}
