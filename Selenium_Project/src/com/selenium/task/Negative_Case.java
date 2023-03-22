package com.selenium.task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Negative_Case {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("TheOps EnablementSolutions Engineering Le"
				+ "adwill be responsible for the design, development, implementation and support of AstraZeneca Information Serv.");
		WebElement passwd = driver.findElement(By.xpath("//input[@name='password']"));
		//passwd.sendKeys("3x@HgypsH76zHb");
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
		//		JavascriptExecutor js = (JavascriptExecutor) driver;
// 		js.executeScript("arguments[0].setAttribute('style','color:pink')", username);
		//  js.executeScript("arguments[0].setAttribute('style','color:red')", mail);
				TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\case3.png");
		FileUtils.copyFile(f, f2);
				
		
		
				
	}

}
