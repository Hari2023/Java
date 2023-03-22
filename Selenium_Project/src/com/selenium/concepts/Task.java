package com.selenium.concepts;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
		Dimension window_size = new Dimension(800, 700);
		driver.manage().window().setSize(window_size);
		
		//driver.close();

	}

}
