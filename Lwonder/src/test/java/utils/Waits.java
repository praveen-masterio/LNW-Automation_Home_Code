package utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Waits {
	public WebDriver driver;

	public Waits(WebDriver driver) {
		this.driver = driver;
	}

	public void implyWait(int Time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Time));
	}

	public void switchFrame(String Frame) {
		driver.switchTo().frame(Frame);
	}
	

	public void captureScreenShot(String screenshotName) throws IOException {

		String captureName = screenshotName.toString().replaceAll(" ", "_");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/" + captureName + ".png");
		FileUtils.copyFile(src, dest);
	}

	public void defaultFrame() {
		driver.switchTo().defaultContent();
	}

	public void alertAccept() throws InterruptedException {
		Thread.sleep(10000);
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
	}

}
