package desginpattern.factorypattern.task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyChromeDriverWithCapabilities implements IDriverManager{

	@Override
	public WebDriver createDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		options.setAcceptInsecureCerts(true)
		.addArguments("--headless")
		.addArguments("--incognito")
		.addArguments("--disable-notifications");
		
		return new ChromeDriver(options);
	}

	@Override
	public void quitDriver() {
		createDriver().quit();
		
	}

}
