package desginpattern.strategypattern;

public class ShareByEmail implements IShare {

	@Override
	public void ishare() {
		System.out.println("Share photo by Email.");
	}

}
