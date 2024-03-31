package testBase;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Waits;

public class BaseClass {
	private WebDriver driver;

	public BaseClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static String Browser, URL = "https://www.amazon.in";
	public ResourceBundle properties;
	public Logger log;
	public ChromeOptions chromeOptions;
	Waits wait = new Waits(driver);

	@Before
	public void setUp(String browser) throws Throwable {
//		log = LogManager.getLogger(this.getClass());
//		properties = ResourceBundle.getBundle("global");
//
//		if (properties.getString("browser1").equalsIgnoreCase("edge")) {
//			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//src//test//resources//msedgedriver.exe");
//			driver = new EdgeDriver();
//			
//		} else if (properties.getString("browser2").equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
//			chromeOptions=new ChromeOptions();
//			chromeOptions.addArguments("--remote-allow-orgins=*#");
//	driver = new ChromeDriver(chromeOptions);
//			
//		}

		WebDriver driver;
		Browser = browser;
		if (Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(URL);
		}
		if (Browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(options);
			driver.manage().window().maximize();
			driver.get(URL);
		}

	}

	public void captureScreenshot(String tName) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/screenshots/" + tName + ".png");
		FileUtils.copyFile(source, target);
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}