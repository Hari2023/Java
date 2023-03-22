package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Find {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("haribaskarg14@gmail.com");

		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("hari2021");

		WebElement login_Btn = driver.findElement(By.name("login"));
		login_Btn.click();

	    driver.navigate().back();
        
	    Thread.sleep(3000);
	   WebElement create = driver.findElement(By.name("Create a Page"));
	   
	   create.click();
//				
//		WebElement forget = driver.findElement(By.linkText("Forgotten password?"));
//		forget.click();
//
//		driver.navigate().back();


//		WebElement create = driver.findElement(By.linkText("Create a Page"));
//		create.click();

		// WebElement pass = driver.findElement(By.name("pass"));

//		WebElement login_Btn = driver.findElement(By.name("login"));
//		login_Btn.click();
//
//		driver.navigate().back();

		// Thread.sleep(3000);

		// WebElement email_One = driver.findElement(By.id("email"));
		// email_One.clear();
		// email_One.sendKeys("haribaskar428@gmail.com");
//		boolean selected = email_One.isSelected();
//		System.out.println(selected);

		// driver.close();

	}

}
