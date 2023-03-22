package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Xpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
		mail.sendKeys("haribaskarg14@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("12345");
		WebElement login_Btn = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		login_Btn.click();
		driver.navigate().back();
//      WebElement forget_Pass = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//     forget_Pass.click();
		driver.navigate().back();
		Thread.sleep(3000);
//        WebElement Create_Page = driver.findElement(By.xpath("//a[text()='Create a Page']"));
//        Create_Page.click();
		WebElement logo = driver.findElement(By.xpath("//h2[contains(text(),'helps you connect')]"));
		String logo_1 = logo.getText();
		System.out.println(logo_1);
	}

}
