package selenium_Hls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng_Demo {
	@Test
	public void login() {
		//WebDriverManager.firefoxdriver().setup();
		// setup
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// impicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// explicit wait
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.alertIsPresent());

		driver.get("https://www.facebook.com/");

		String b = driver.getPageSource();
		System.out.println(b);
		// Assert.assertEquals(title, "Facebooklog in or sign up");
		driver.close();
	}

}
