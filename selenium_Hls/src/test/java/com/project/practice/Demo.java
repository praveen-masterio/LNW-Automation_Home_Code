package com.project.practice;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	@Test
	public void login() {

		WebDriverManager.firefoxdriver().setup();
		// setup
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=OlMX0gxyL58");
		String s = driver.getTitle();
		System.out.println(s);
		driver.quit();
		// ChromeDriver driver = new ChromeDriver();

	}

}