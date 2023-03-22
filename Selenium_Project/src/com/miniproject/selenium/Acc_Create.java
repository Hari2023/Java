package com.miniproject.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Acc_Create {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("haribask@gmail.com");
		WebElement create = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		create.click();
		WebElement rdo_Btn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		rdo_Btn.click();
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("HariBaskar");
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		lastname.sendKeys("G");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Hari2023");

		WebElement days = driver.findElement(By.xpath("//select[@name='days']"));

		WebElement month = driver.findElement(By.xpath("//select[@name='months']"));

		WebElement year = driver.findElement(By.xpath("//select[@name='years']"));

		Select a = new Select(days);
		a.selectByValue("19");
		Select b = new Select(month);
		b.selectByValue("10");
		Select c = new Select(year);
		c.selectByValue("2022");

		WebElement company = driver.findElement(By.xpath("//input[@name='company']"));
		company.sendKeys("Wipro");

		WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("OMR");

		WebElement add2 = driver.findElement(By.xpath("//input[@name='address2']"));
		add2.sendKeys("Chennai,Tamil Nadu");

		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Chennai");

		WebElement state = driver.findElement(By.xpath("(//select[contains(@name,'id')])[1]"));
		Select d = new Select(state);
		d.selectByValue("31");

		WebElement postcod = driver.findElement(By.xpath("//input[@name='postcode']"));
		postcod.sendKeys("12345");

		WebElement united = driver.findElement(By.xpath("(//select[contains(@name,'id')])[2]"));
		Select e = new Select(united);
		e.selectByValue("21");

		WebElement additional = driver.findElement(By.xpath("//textarea[@name='other']"));
		additional.sendKeys("Purchase");

		WebElement home = driver.findElement(By.xpath("//input[@name='phone']"));
		home.sendKeys("7502530951");

		WebElement personal = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		personal.sendKeys("6379724477");

		WebElement future_Add = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		future_Add.sendKeys("Trichy");

		WebElement register = driver.findElement(By.xpath("//button[@id='submitAccount']"));
		register.click();
	}

}
