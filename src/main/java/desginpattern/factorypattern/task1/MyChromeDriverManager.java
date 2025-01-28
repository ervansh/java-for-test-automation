package desginpattern.factorypattern.task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyChromeDriverManager implements IDriver {


	@Override
	public WebDriver createDriver() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}

	@Override
	public void quitDriver() {
		createDriver().quit();		
	}

}
