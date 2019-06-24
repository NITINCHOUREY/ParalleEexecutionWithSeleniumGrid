package a;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

	public static WebDriver getDriver(String browserName) {
		WebDriver driver = null;

		try {
			if("chrome".equalsIgnoreCase(browserName)){
			DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(new URL("http://172.25.210.17:4444/wd/hub"), desiredCapabilities);
			}
			if("ie".equalsIgnoreCase(browserName)){
				DesiredCapabilities desiredCapabilities = DesiredCapabilities.internetExplorer();
				driver = new RemoteWebDriver(new URL("http://172.25.210.17:4444/wd/hub"), desiredCapabilities);
				}
			if("firefox".equalsIgnoreCase(browserName)){
				DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://172.25.210.17:4444/wd/hub"), desiredCapabilities);
				}
			if("edge".equalsIgnoreCase(browserName)){
				DesiredCapabilities desiredCapabilities = DesiredCapabilities.edge();
				driver = new RemoteWebDriver(new URL("http://172.25.210.17:4444/wd/hub"), desiredCapabilities);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
}
