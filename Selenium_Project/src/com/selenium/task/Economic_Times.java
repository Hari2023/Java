package com.selenium.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Economic_Times {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://economictimes.indiatimes.com/markets");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement economic = driver.findElement(By.xpath("//span[@class='price']//parent::div[@class='item up']"));
		System.out.println(economic.getText());
		

	}

}
