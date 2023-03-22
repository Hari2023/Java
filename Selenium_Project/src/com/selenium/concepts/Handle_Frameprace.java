package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Frameprace {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("singleframe");
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Hari");
		
		driver.switchTo().defaultContent();
		
		WebElement Iframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		Iframe.click();
		
        WebElement outer_frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	
		driver.switchTo().frame(outer_frame);
		
		WebElement frame_two = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(frame_two);
		
		WebElement text_two = driver.findElement(By.xpath("//input[@type='text']"));
		text_two.sendKeys("Baskar");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		WebElement singleframe = driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
		singleframe.click();
		
		
		
		
		

	}

}
