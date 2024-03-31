package com.project.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Remove_Duplicates {
	@SuppressWarnings("deprecation")
	@Test
	public void login() {
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", false);

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get(
				"https://www.redbus.in/?_branch_match_id=link-1118423565855747807&_branch_referrer=H4sIAAAAAAAAA8soKSkottLXzzUrSNVLLCjQy8nMy9bPMHH3KUgtrvQtTQIAT6Jk9SEAAAA%3D&gclid=EAIaIQobChMIiIiTk5ftgAMV2ZNmAh1yfg_zEAAYASAAEgIaUfD_BwE");
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("coimbatore");
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("chennai");

		driver.findElement(By.xpath("//span[@class=\"dateText\"]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement wb = driver.findElement(By.className("sc-jzJRlG dPBSOp"));
		// driver.switchTo().alert().accept();
		// driver.findElement(By.xpath("/text[@class=\"dateText\"]"));
		wb.sendKeys("24082023");
		driver.findElement(By.id("search_button")).click();
		driver.quit();

	}

}
