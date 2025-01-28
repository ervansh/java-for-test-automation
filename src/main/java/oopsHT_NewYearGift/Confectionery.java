package oopsHT_NewYearGift;

abstract class Confectionery {
	protected String name;
	protected double weight;

	public Confectionery(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

}
