package selenium_Hls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Movetoelement {
	WebDriver driver = new ChromeDriver();
	//("D:\project software\selinium\chromedriver.exe");
	Actions actions = new Actions(driver);

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://magento.softwaretestingboard.com/");
	}

	@Test
	public void move() {
		actions.moveToElement(driver.findElement(By.xpath("//input[@id='search']"))).click().sendKeys("watches");
		actions.perform();

	}

}