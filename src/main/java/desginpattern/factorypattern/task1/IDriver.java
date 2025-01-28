package desginpattern.factorypattern.task1;

import org.openqa.selenium.WebDriver;

public interface IDriver {

	public WebDriver createDriver();
	public void quitDriver();
}
