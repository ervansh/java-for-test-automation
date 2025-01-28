package desginpattern.builderpattern;

public class OrderBicycle {

	public static void main(String[] args) {
		System.out.println("Customer orders bicycle with double seat and carrier.");
		
		Bicycle bicyle = new Bicycle.BicycleBuilder("2", "both: front and back")
		.setDoubleSeats(true)
		.setCarrier(true)
		.build();
		
		
		System.out.println(bicyle);

	}

}
