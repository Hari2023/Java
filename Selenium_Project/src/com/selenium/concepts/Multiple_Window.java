package com.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_Window {
	public static WebDriver driver;

	public static void right_CLick(WebDriver d, WebElement element) {
		Actions a = new Actions(d);
		a.contextClick(element).build().perform();
	}

	public static void down_And_Enter() throws AWTException {

		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		s.keyRelease(KeyEvent.VK_DOWN);
		s.keyPress(KeyEvent.VK_ENTER);
		s.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.amazon.com/");
		Thread.sleep(9000);
		WebElement sub_Btn = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		sub_Btn.click();
		WebElement deals = driver.findElement(By.xpath("(//a[contains(.,'Deals')])[1]"));
		right_CLick(driver, deals);
		down_And_Enter();
		WebElement gift = driver.findElement(By.xpath("//a[.='Gift Cards']"));
		right_CLick(driver, gift);
		down_And_Enter();
		WebElement registry = driver.findElement(By.xpath("//a[.='Registry']"));
		right_CLick(driver, registry);
		down_And_Enter();
		Set<String> all_Id = driver.getWindowHandles();// 1,2,3,4
		String excepted_Url = "https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc";
		for (String id : all_Id) {
			if (driver.switchTo().window(id).getCurrentUrl().equals(excepted_Url)) {
				System.out.println(driver.getTitle());
				WebElement addphoto = driver.findElement(By.xpath("//span[.='Add Your Photo']"));
				addphoto.click();
				WebElement giftcard = driver.findElement(By.xpath("(//span[contains(.,'eGift ')])[2]"));
				giftcard.click();
				WebElement std_Btn = driver.findElement(By.xpath("(//button[@type='button'])[11]"));
				std_Btn.click();
				WebElement emails = driver.findElement(By.xpath("//textarea[@name='emails']"));
				emails.sendKeys("hari@gmail.com");
				WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
				name.sendKeys("Hari");
				WebElement date = driver.findElement(By.xpath("(//input[@readonly='readonly'])[1]"));
				date.click();
				WebElement day = driver.findElement(By.xpath("//a[.='6']"));
				day.click();
				WebElement addcart = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
				addcart.click();
				break;
				

			}

		}

	}

}
