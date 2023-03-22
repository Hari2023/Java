package com.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Single_Window {
	public static WebDriver driver;

	public static void rightclick(WebDriver d, WebElement element) {
		Actions s = new Actions(driver);
		s.contextClick(element).build().perform();
	}

	public static void down_And_Enter() throws AWTException {
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		WebElement mail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		rightclick(driver, mail);
		down_And_Enter();

		String parent_Id = driver.getWindowHandle();
		Set<String> all_Id = driver.getWindowHandles();
		for (String id : all_Id) {
			if (id.equals(parent_Id)) {
				continue;
			} else {
				driver.switchTo().window(id);
			}

		}

	}

}
