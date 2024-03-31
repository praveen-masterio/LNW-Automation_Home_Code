package selenium_Hls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_drop {
	WebDriver driver=new ChromeDriver();
	@Test
	public void jquery()
	{
		WebDriverManager.chromedriver().setup();
		Actions actions=new Actions(driver);
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		actions.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"slider\"]")), 200, 0).perform();
		
	}

}
