package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");

		Thread.sleep(3000);

		WebElement superhero = driver.findElement(By.id("superheros"));

		Select b1 = new Select(superhero);
		b1.selectByValue("aq");
		Thread.sleep(2000);
		b1.deselectByValue("aq");
		b1.selectByVisibleText("Aquaman");
		Thread.sleep(2000);
		//b1.deselectByVisibleText("Aquaman");
		b1.deselectAll();

//		WebElement fruit = driver.findElement(By.id("fruits"));
//		Select b = new Select(fruit);
//		b.selectByIndex(3);
//		Thread.sleep(2000);
//		b.deselectByIndex(4);
//		Thread.sleep(2000);
	}

}
