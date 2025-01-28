package desginpattern.factorypattern.task1;

import org.openqa.selenium.WebDriver;

public class BrowserFactoryDemo {
	private static WebDriver driver;

	public static void main(String[] args) {

		driver = WebDriverFactory.getDriver("chrome").createDriver();
		driver.get("https://www.google.com/");
		
	}

}
