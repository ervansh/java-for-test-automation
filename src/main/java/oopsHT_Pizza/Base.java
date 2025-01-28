package oopsHT_Pizza;

public enum Base {
	  STANDARD(50.00),
	    SOFT(80.50);
	    
	    private double cost;
	    
	    Base(double cost) {
	        this.cost = cost;
	    }
	    
	    public double getCost() {
	        return cost;
	    }
}
