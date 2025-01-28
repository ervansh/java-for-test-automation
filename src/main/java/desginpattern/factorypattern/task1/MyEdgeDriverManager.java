package desginpattern.factorypattern.task1;

import org.openqa.selenium.WebDriver;

public class MyEdgeDriverManager implements IDriver {

	@Override
	public WebDriver createDriver() {
		System.out.println("Launching Edge...");
		return null;
	}

	@Override
	public void quitDriver() {
		createDriver().quit();

	}

}
