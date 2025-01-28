package java8.ht.consumersupplier;

import java.util.ArrayList;
import java.util.function.Consumer;

import java8.ht.predicates.Product;

public class Task4 {


	public static void main(String[] args) {


		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product("Pen", 10, "stationary", "A"));
		productlist.add(new Product("Dell Lattitude", 40000, "Electronics", "L"));
		productlist.add(new Product("Mouse", 1500, "Electronics", "M"));
		
		Consumer<ArrayList<Product>> updategrade = p ->{
			for (int i = 0; i < p.size(); i++) {
				  Product pr = p.get(i);
				 if(pr.getPrice()>1000) {
					 System.out.println(" Grade before update: "+pr.getGrade());
					 pr.setGrade("Premium");
					 pr.setName(pr.getName()+"*");
					 System.out.println(" Grade after update: "+pr.getGrade());
				 }
			}
		};
		
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
		updategrade.andThen(printproduct).accept(productlist);
	
	
	}


}
