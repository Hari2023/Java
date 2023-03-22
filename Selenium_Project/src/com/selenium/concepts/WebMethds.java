package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethds {

	public static void main(String[] args) throws My_Exception, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");

		WebElement mail = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.name("pass"));
		if (mail.isEnabled() && pass.isEnabled()) {
			mail.sendKeys("abc@gmail.com");
			pass.sendKeys("1234");
		} else {
			throw new My_Exception();
		}
//		boolean displayed = mail.isDisplayed();
//		System.out.println(displayed);
//		WebElement forget = driver.findElement(By.linkText("Forgotten password?"));
//		forget.click();
//		driver.navigate().back();
		WebElement create = driver.findElement(By.linkText("Create a Page"));
		create.click();
		String mail_Attri = mail.getAttribute("placeholder");
		System.out.println(mail_Attri);
		String value = mail.getAttribute("value");
		System.out.println(value);
		String passwd = pass.getAttribute("value");
		System.out.println(passwd);
		String mail_tag = mail.getTagName();
		System.out.println(mail_tag);
		Point location = mail.getLocation();
		System.out.println(location);
		Dimension size = pass.getSize();
		System.out.println(size);
		WebElement login_Btn = driver.findElement(By.name("login"));
		String cssValue = login_Btn.getCssValue("line-height");
		System.out.println(cssValue);
		Rectangle rect = mail.getRect();
		System.out.println("Mail rectangle height: " + rect.getHeight());
//		System.out.println("Mail rectangle width: "+rect.getWidth());
//		System.out.println("Mail rectangle x value is: "+rect.getX());
//		System.out.println("Mail rectangle y value is: "+rect.getY());
//		
//		driver.close();

//				WebElement btn = driver.findElement(By.id("u_0_0_ok"));
//				btn.click();
//
//				WebElement s = driver
//						.findElement(By.xpath("span[@class='_8esa']/input[preceding-sibling::label[text()='Male']"));
//				System.out.println("Before: " + s.isSelected());
//				if (!(s.isSelected())) {
//					s.click();
//
//				}
//				System.out.println("After: " + s.isSelected());
//	
//	

	}

}
