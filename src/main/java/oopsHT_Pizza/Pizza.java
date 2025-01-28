package oopsHT_Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private Base base;
    private List<Topping> toppings;
    
    public Pizza(Base base) {
        this.base = base;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calculateCost() {
        double totalCost = base.getCost();
        for (Topping topping : toppings) {
            totalCost += topping.getCost();
        }
        return totalCost;
    }
}
