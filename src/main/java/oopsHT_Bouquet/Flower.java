package oopsHT_Bouquet;

public class Flower {
	   private String name;
	    private double cost;
	    
	    public Flower(String name, double cost) {
	        this.name = name;
	        this.cost = cost;
	    }
	    
	    public double getCost() {
	        return cost;
	    }

	    public String getName() {
	        return name;
	    }
}
