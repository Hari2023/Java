package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		Thread.sleep(3000);
		WebElement fruit = driver.findElement(By.id("fruits"));
		
		WebElement superhero = driver.findElement(By.id("superheros"));
		Select b = new Select(fruit);
		b.selectByIndex(3);
		b.selectByIndex(5);
		WebElement singledropdown = b.getFirstSelectedOption();
		System.out.println("Single dropdown: "+singledropdown.getText());
		boolean multiple = b.isMultiple();
		System.out.println(multiple);
		Thread.sleep(2000);
		Select b1 = new Select(superhero);
		b1.selectByValue("aq");
		b1.selectByValue("bt");
		b1.selectByVisibleText("Aquaman");
		b1.selectByVisibleText("Batman");
		WebElement first = b1.getFirstSelectedOption();
		System.out.println("first selec: "+first.getText());
		boolean multiple1 = b1.isMultiple();
		System.out.println("Multiple drop down: " + multiple1);
//		
		List<WebElement> allSelectedOptions = b1.getAllSelectedOptions();
		  for (int i = 0; i < allSelectedOptions.size(); i++) {
			  
			  System.out.println(allSelectedOptions.get(i).getText());			
		}
		  
		  System.out.println("----------------------------------------------------");
		  
		  for (WebElement alloption : allSelectedOptions) {
			System.out.println(alloption.getText());
		}
		  


		
		
		
		
		
		
//		List<WebElement> options = b1.getOptions();
//		
//		for (int i = 0; i < options.size(); i++) {
//			System.out.println(options.get(i).getText());
//			
//		}
//   
//		System.out.println("--------------------------------------------------------------");
//	
//	for (WebElement opt : options) {
//		System.out.println(opt.getText());
//	}	
//	
//	
	
	}

}
