package selenium_Hls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_switch {

	WebDriver driver = new ChromeDriver();

	// WebDriverManager.chromedriver().setup();

	// ("D:\project software\selinium\chromedriver.exe");
	Actions actions = new Actions(driver);

	@BeforeTest
	public void setup() {

		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
	}

	@Test
	public void switch_frame() {
		driver.switchTo().frame("iframeResult");
		String a = driver.findElement(By.xpath("/html/body/button")).getText();
		driver.findElement(By.xpath("/html/body/button")).click();
		System.out.println(a);

	}

}
