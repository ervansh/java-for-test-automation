package oopsHT_NewYearGift;

import java.util.ArrayList;
import java.util.List;

public class Gift {

	private List<Confectionery> confectionaries;

	public Gift() {
		confectionaries = new ArrayList<Confectionery>();
	}
	
	public void addConfectionery(Confectionery confectionary) {
		confectionaries.add(confectionary);
	}
	
	public double getTotalWeight() {
		double totalWeight = 0;
		
		for (Confectionery c : confectionaries) {
			totalWeight += c.getWeight();
		}
		
		return totalWeight;
	}
	
	
	public static void main(String[] args) {
		Gift gift = new Gift();
		gift.addConfectionery(new Chocolate("KitKat", 50, 50));
		gift.addConfectionery(new Sweet("Fruit Candy", 30, "Fruit"));
		
		System.out.println("Total weight of the gift is "+gift.getTotalWeight());
	}
	
}
