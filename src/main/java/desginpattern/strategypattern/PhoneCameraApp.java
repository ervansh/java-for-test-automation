package desginpattern.strategypattern;

public abstract class PhoneCameraApp {

	private IShare sharestrategy;

	abstract void editPhoto();

	public void savePhoto() {
		System.out.println("Save photo.");
	}

	public void takePhoto() {
		System.out.println("Take photo.");
	}

	public void setShareStrategy(IShare sharestrategy) {
		this.sharestrategy = sharestrategy;
	}

	public void sharePhoto() {
		sharestrategy.ishare();
	}

}
