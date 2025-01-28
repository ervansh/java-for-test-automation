package java8.ht.consumersupplier;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

import java8.ht.predicates.Product;

public class Task5_Supplier {

	public static void main(String[] args) {
		
		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product("Pen", 10, "stationary", "A"));
		productlist.add(new Product("Dell Lattitude", 40000, "Electronics", "L"));
		productlist.add(new Product("Mouse", 1500, "Electronics", "M"));
		
		
		Supplier<Product> randomproduct = () -> {
			Random random = new Random();
		Product pro = productlist.get(random.nextInt(productlist.size()));
			return pro;
		};
		
		
		Product pr = randomproduct.get();
		System.out.println(pr);
	}

}
