package desginpattern.factorypattern.task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirefoxDriverWithCapabilities implements IDriverManager{

	@Override
	public WebDriver createDriver() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		
		options.setAcceptInsecureCerts(true)
		.addArguments("--headless")
		.addArguments("-private")
		.addArguments("--disable-notifications");
		
		return new FirefoxDriver(options);

	}

	@Override
	public void quitDriver() {
		createDriver().quit();
	}

}
