package desginpattern.factorypattern.task1;

import org.openqa.selenium.WebDriver;

public class MyFirefoxDriverManager implements IDriver {

	@Override
	public WebDriver createDriver() {
		System.out.println("Launching Firefox...");
		return null;
	}

	@Override
	public void quitDriver() {
		createDriver().quit();	
	}

}
