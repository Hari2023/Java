package com.selenium.concepts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_Class extends Keyboard_Actions {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement gmail = driver.findElement(By.xpath("//a[.='Gmail']"));
		Two_Class a = new Two_Class();
		a.Rightclick(driver, gmail);
		a.down();
		a.Enter();

	}

}
