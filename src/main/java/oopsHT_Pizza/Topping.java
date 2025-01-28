package oopsHT_Pizza;

public enum Topping {
	TOMATO(25.50),
    CORN(35.75),
    MUSHROOMS(50.00);
    
    private double cost;
    
    Topping(double cost) {
        this.cost = cost;
    }
    
    public double getCost() {
        return cost;
    }
}
