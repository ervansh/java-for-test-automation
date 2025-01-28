package desginpattern.factorypattern.task2;

import desginpattern.factorypattern.task1.IDriver;
import desginpattern.factorypattern.task1.MyChromeDriverManager;
import desginpattern.factorypattern.task1.MyEdgeDriverManager;
import desginpattern.factorypattern.task1.MyFirefoxDriverManager;

public class DriverFactoryWithCapabilities {


	public static IDriver getDriver(String browserType) {
		
		switch (browserType.toLowerCase()) {
		
		case "chrome":
			return new MyChromeDriverManager();
			
		case "edge":
		return new MyEdgeDriverManager();
		
		case "firefox":
		return new MyFirefoxDriverManager();

		default:
			throw new IllegalArgumentException("Enter a valid browser.");
		}
	}

}
