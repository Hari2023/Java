package com.selenium.concepts;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Handle_Alert {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\msedgedriver1.exe");
		EdgeOptions options = new EdgeOptions();
		
		options.addArguments("InPrivate");
		options.addArguments("--disable-notifications");
		options.setExperimentalOption("prefs", options);

		driver = new EdgeDriver(options);
		driver.get("https://www.tomorrow.io/weather/");
		driver.manage().window().maximize();

		
		
		
		
		//		WebElement simple_alert = driver
//				.findElement(By.xpath("//button[@onclic" 
//		+ "k='alertbox()']//ancestor::div[@id='OKTab']"));
//		simple_alert.click();
//		Alert s = driver.switchTo().alert();
//		// s.accept();
//		s.dismiss();
//		WebElement confirm_alert = driver.findElement(By.xpath("(//a[contains(text(),'Alert with')])[2]"));
//		confirm_alert.click();
//		WebElement confm_btn = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
//		confm_btn.click();
//		Alert c = driver.switchTo().alert();
//		c.dismiss();
//		WebElement prompt_alert = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]"));
//		prompt_alert.click();
//		WebElement prompt_btn = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
//		prompt_btn.click();
//
//		Alert e = driver.switchTo().alert();
//		String text = e.getText();
//		System.out.println(text);

//	    Thread.sleep(1000);
		
//	    https://demo.automationtesting.in/Alerts.html
//	    WebElement ad = driver.findElement(By.xpath("(//svg[@xmlns='http://www.w3.org/2000/svg'])[1]"));
//	    ad.click();

//           driver.get("https://letcode.in/dropdowns");
//           driver.manage().window().maximize();
//           WebElement worksp = driver.findElement(By.xpath("//a[text()='Work Space']"));
//	       worksp.click();
//	       Thread.sleep(2000);
//	    
//	       WebElement dialog = driver.findElement(By.xpath("//a[text()='Dialog']"));
//	      dialog.click();
//	      Thread.sleep(2000);
//	      WebElement modern = driver.findElement(By.xpath("//button[@id='modern']"));
//	      modern.click();
//	      Thread.sleep(1000);
//	    
//	      WebElement close = driver.findElement(By.xpath("//button[@aria-label='close']"));
//	      close.click();

	}

}
