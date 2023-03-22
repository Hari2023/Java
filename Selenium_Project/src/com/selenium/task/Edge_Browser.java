package com.selenium.task;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Edge_Browser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();// upcasting
		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		System.out.println(title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
//	    String pageSource = driver.getPageSource();
//	    System.out.println(pageSource);
//	    driver.close();
//	    //	    driver.quit();
		// Navigate Command
		driver.navigate().to("https://accounts.spotify.com/en/login?continue=https");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		// Window Manage
		Dimension size1 = driver.manage().window().getSize();
		System.out.println("Before window Size: " + size1);
		driver.manage().window().maximize();
		 driver.manage().window().fullscreen();
		 Dimension size = driver.manage().window().getSize();
		System.out.println("After window Size: " + size);
		Dimension s = new Dimension(750, 550);
		driver.manage().window().setSize(s);
		driver.manage().deleteAllCookies();
	}

	}


