package a;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class Testcases {
	static {
		PropertyConfigurator.configure("log4j.properties");
	}
	Logger logger = Logger.getLogger(Testcases.class);

	@Test
	public void Test1() {
		WebDriver driver = null;
		driver = DriverFactory.getDriver("chrome");
		driver.get("https://www.facebook.com/");
		logger.info("This is Test1");
		driver.quit();

	}

	@Test
	public void Test2() {
		WebDriver driver = null;
		driver = DriverFactory.getDriver("edge");
		driver.get("https://www.linkedin.com/feed/");
		logger.info("This is Test2");
		driver.quit();
	}

	@Test
	public void Test3() {
		WebDriver driver = null;
		driver = DriverFactory.getDriver("firefox");
		driver.get("https://www.netflix.com/browse");
		logger.info("This is Test3");
		driver.quit();
	}

	@Test
	public void Test4() {
		WebDriver driver = null;
		driver = DriverFactory.getDriver("ie");
		driver.get("https://www.rentmacha.com/");
		logger.info("This is Test4");
		driver.quit();
	}

	@Test
	public void Test5() {
		WebDriver driver = null;
		driver = DriverFactory.getDriver("opera");
		driver.get("https://www.primevideo.com/?ref_=dvm_pds_amz_in_as_s_g_51894|c_198882621516_m_xPFx2DvE-dc_s_");
		logger.info("This is Test5");
		driver.quit();
	}

}
