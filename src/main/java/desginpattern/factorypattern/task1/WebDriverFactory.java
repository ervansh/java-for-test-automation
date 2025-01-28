package desginpattern.factorypattern.task1;

public class WebDriverFactory {

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
