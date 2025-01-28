package oopsHT_NewYearGift;

public class Chocolate extends Confectionery {

	private int cocoaPercentage;

	public Chocolate(String name, double weight, int cocoaPercentage) {
		super(name, weight);
		this.cocoaPercentage = cocoaPercentage;
	}

	public int getCocoaPercentage() {
		return cocoaPercentage;
	}

}
