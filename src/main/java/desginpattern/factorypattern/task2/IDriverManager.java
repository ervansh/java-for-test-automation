package desginpattern.factorypattern.task2;

import org.openqa.selenium.WebDriver;

public interface IDriverManager {

	public WebDriver createDriver();
	public void quitDriver();
}
