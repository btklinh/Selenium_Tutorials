package browserFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

	protected WebDriver driver;

	protected abstract void createDriver();

	public void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public WebDriver getDriver() {
		if (driver == null) {
			createDriver();

		}
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}
}
