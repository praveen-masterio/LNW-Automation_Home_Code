package com.hardcoder.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Dropdown {
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		// Find all anchor tags and print the count
		WebElement tagName = driver.findElement(By.tagName("a"));
		System.out.println("Number of anchor tags: " + tagName.getSize());

		// Find all iframe tags and print the count
		WebElement iframes = driver.findElement(By.tagName("iframe"));
		System.out.println("Number of iframes: " + iframes.getSize());

		driver.quit();
	}
}
