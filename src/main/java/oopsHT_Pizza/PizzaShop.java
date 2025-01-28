package oopsHT_Pizza;

public class PizzaShop {

	public static void main(String[] args) {
		Pizza pizza = new Pizza(Base.STANDARD);
        pizza.addTopping(Topping.TOMATO);
        pizza.addTopping(Topping.CORN);
        pizza.addTopping(Topping.MUSHROOMS);
        
        System.out.println("Total cost of the pizza: Rs " + pizza.calculateCost());

	}

}
