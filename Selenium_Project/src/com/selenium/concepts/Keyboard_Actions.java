package com.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {
	public static WebDriver driver;

	public static void down() throws AWTException {
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
	}

	public static  void Enter() throws AWTException {
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void Rightclick(WebDriver d, WebElement element) {
		Actions b = new Actions(d);
		b.contextClick(element).build().perform();
	}

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement gmail = driver.findElement(By.xpath("//a[.='Gmail']"));
		Rightclick(driver, gmail);
		down();
		Enter();

	}

}
