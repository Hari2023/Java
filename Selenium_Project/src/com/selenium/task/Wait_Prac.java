package com.selenium.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Prac {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://letcode.in/waits");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement sim = driver.findElement(By.xpath("//div[@class='control']//child::button[@id='accept']"));
		sim.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		

	}
}
/*driver.get("https://www.facebook.com/login/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement mail = driver.findElement(By.xpath("//div[@id='email_container']//child::input[@name='email']"));
mail.sendKeys("abc@gmail.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement pass = driver.findElement(By.xpath("//div[@class='_55r"
		+ "1 _1kbt']//child::inpu"
		+ "t[@name='passs']"));
pass.sendKeys("123");*/
		

		
		

		


