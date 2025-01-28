package java8.ht.consumersupplier;

import java.util.ArrayList;
import java.util.function.Consumer;

import java8.ht.predicates.Product;

public class Task3 {

	public static void main(String[] args) {


		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product("Pen", 10, "stationary", "A"));
		productlist.add(new Product("Dell Lattitude", 40000, "Electronics", "L"));
		productlist.add(new Product("Mouse", 1500, "Electronics", "M"));
		
		Consumer<ArrayList<Product>> updatename = p ->{
			for (int i = 0; i < p.size(); i++) {
				  Product pr = p.get(i);
				 if(pr.getPrice()>3000) {
					 System.out.println("Product name before update: "+pr.getName());
					 pr.setName(pr.getName()+"*");
					 System.out.println("Product name after update: "+pr.getName()+"\n");
				 }
			}
		};
		
		Consumer<ArrayList<Product>> printproduct = product ->
		{
			product.forEach(
					p -> System.out.println("Product Name: "+p.getName()+"\n"+
							"Product Price: "+p.getPrice()+"\n"+
							"Product Category: "+p.getCategory()+"\n"+
							"Product Grade: "+p.getGrade()
							)
					);
		};
		updatename.andThen(printproduct).accept(productlist);
	
	
	}

}
