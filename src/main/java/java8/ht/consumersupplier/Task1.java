package java8.ht.consumersupplier;

import java.util.ArrayList;
import java.util.function.Consumer;

import java8.ht.predicates.Product;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product("Pen", 10, "stationary", "A"));
		productlist.add(new Product("Dell Lattitude", 40000, "Electronics", "L"));
		productlist.add(new Product("Mouse", 1500, "Electronics", "M"));
		
		Consumer<ArrayList<Product>> printproduct = product ->
		{
			product.forEach(
					p -> System.out.println("Product Name: "+p.getName()+"\n"+
							"Price: "+p.getPrice()+"\n"+
							"Category: "+p.getCategory()+"\n"+
							"Grade: "+p.getGrade()
							)
					);
		};
		printproduct.accept(productlist);
	}

}
