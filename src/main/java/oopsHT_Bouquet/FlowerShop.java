package oopsHT_Bouquet;

public class FlowerShop {

	public static void main(String[] args) {
		Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Flower("Rose", 1.0));
        bouquet.addFlower(new Flower("Jasmine", 2.0));
        bouquet.addFlower(new Flower("Lily", 3.0));
        
        System.out.println("Total cost of the bouquet: $ " + bouquet.calculateCost());

	}

}
