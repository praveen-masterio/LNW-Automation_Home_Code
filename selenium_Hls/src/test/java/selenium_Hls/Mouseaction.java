package selenium_Hls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseaction {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setup() {
		WebDriverManager.chromiumdriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		// Alert a = driver.switchTo().alert();
		// a.dismiss();

	}

	@org.testng.annotations.Test
	public void moveElement() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("_2sVfI7")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("selectorsHub"))).click().perform();

	}

	@AfterTest
	public void Teardown() {
		driver.close();
	}
}
