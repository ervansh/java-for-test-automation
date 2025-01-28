package desginpattern.builderpattern;

public class Bicycle {

	private String gears;
	private String doubleStands;
	private boolean doubleSeats;
	private boolean carrier;

	private String wheels;
	private String breaks;

	private Bicycle(BicycleBuilder builder) {
		this.gears = builder.gears;
		this.doubleStands = builder.doubleStands;
		this.doubleSeats = builder.doubleSeats;
		this.carrier = builder.carrier;
		this.wheels = builder.wheels;
		this.breaks = builder.breaks;
	}

	public String getGears() {
		return gears;
	}

	public void setGears(String gears) {
		this.gears = gears;
	}

	public String getDoubleStands() {
		return doubleStands;
	}

	public void setDoubleStands(String doubleStands) {
		this.doubleStands = doubleStands;
	}

	public boolean getDoubleSeats() {
		return doubleSeats;
	}

	public void setDoubleSeats(boolean doubleSeats) {
		this.doubleSeats = doubleSeats;
	}

	public boolean getCarrier() {
		return carrier;
	}

	public void setCarrier(boolean carrier) {
		this.carrier = carrier;
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public String getBreaks() {
		return breaks;
	}

	public void setBreaks(String breaks) {
		this.breaks = breaks;
	}


	@Override
	public String toString() {
		return "Bicycle [gears=" + gears + ", doubleStands=" + doubleStands + ", doubleSeats=" + doubleSeats
				+ ", carrier=" + carrier + ", wheels=" + wheels + ", breaks=" + breaks + "]";
	}


	public static class BicycleBuilder {
		private String gears;
		private String doubleStands;
		private boolean doubleSeats;
		private boolean carrier;

		private String wheels;
		private String breaks;

		public BicycleBuilder(String wheels, String breaks) {
			this.wheels = wheels;
			this.breaks = breaks;
		}

		public BicycleBuilder setGears(String gears) {
			this.gears = gears;
			return this;
		}

		public BicycleBuilder setDoubleStands(String doubleStands) {
			this.doubleStands = doubleStands;
			return this;
		}

		public BicycleBuilder setDoubleSeats(boolean doubleSeats) {
			this.doubleSeats = doubleSeats;
			return this;
		}

		public BicycleBuilder setCarrier(boolean carrier) {
			this.carrier = carrier;
			return this;
		}

		public BicycleBuilder setWheels(String wheels) {
			this.wheels = wheels;
			return this;
		}

		public BicycleBuilder setBreaks(String breaks) {
			this.breaks = breaks;
			return this;
		}

		public Bicycle build() {
			return new Bicycle(this);
		}
	}
}
