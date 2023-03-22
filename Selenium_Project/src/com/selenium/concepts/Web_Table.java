package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qavbox.github.io/demo/webtable/");

		System.out.println("---Particular Cell---");
		WebElement particular_Cell = driver.findElement(By.xpath("//table[@id='table02']/tbody" 
		+ "/tr[32]/td[4]	"));
		System.out.println(particular_Cell.getText());
		System.out.println("---Specific Row---");
		List<WebElement> spec_Row = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr[17]/td"));
		for (WebElement row : spec_Row) {
			System.out.println(row.getText());
		}
		System.out.println("---Specific Column---");
		List<WebElement> spec_Column = driver.findElements(By.xpath("//table[@id='table02']/tbody" + "/tr/td[3]	"));
		for (WebElement column : spec_Column) {
			System.out.println(column.getText());
		}
		System.out.println("---All Data---");
		List<WebElement> all_Data = driver.findElements(By.xpath("//table[@id='table02']" + "/tbody/tr/td"));
		for (WebElement all : all_Data) {
			System.out.println(all.getText());

		}

	}

}
