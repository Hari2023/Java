package com.selenium.concepts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class My_Store_Prac {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.com/index.php");
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("ganesan@gmail.com");
		WebElement createid = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		createid.click();
		WebElement radiobtn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radiobtn.click();
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("Hari");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		lastname.sendKeys("G");
		WebElement passwd = driver.findElement(By.xpath("//input[@type='password']"));
		passwd.sendKeys("123456");
		WebElement days = driver.findElement(By.xpath("//select[@name='days']"));
		WebElement month = driver.findElement(By.xpath("//select[@name='months']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select a = new Select(days);
		a.selectByValue("5");
		boolean day = a.isMultiple();
		System.out.println("Day is "+day);
		Select b = new Select(month);
		b.selectByValue("10");
		Select c = new Select(year);
	    c.selectByValue("2022");
		WebElement checkbox = driver.findElement(By.xpath("//input[@name='newsletter']"));
		checkbox.click();
		WebElement firstNam = driver.findElement(By.xpath("//input[@id='firstname']"));
		firstNam.sendKeys("Hari");
		WebElement lastnam = driver.findElement(By.xpath("//input[@id='lastname']"));
		lastnam.sendKeys("Baskar");
		WebElement company = driver.findElement(By.xpath("//input[@name='company']"));
		company.sendKeys("Greens Tech");
		WebElement add1 = driver.findElement(By.xpath("//input[@name='address1']"));
	    add1.sendKeys("No.5");
	    WebElement add2 = driver.findElement(By.xpath("//input[@name='address2']"));
		add2.sendKeys("Adyar");
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Chennai");
		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select a5 = new Select(state);
		a5.selectByValue("47");
		WebElement postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
		postcode.sendKeys("11111");
		WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
		Select a4 = new Select(country);
		a4.selectByValue("21");
		WebElement addinform = driver.findElement(By.xpath("//textarea[@id='other']"));
		addinform.sendKeys("All details mention above");
		WebElement Homephone = driver.findElement(By.xpath("//input[@name='phone']"));
		Homephone.sendKeys("04316787655");
		WebElement myphone = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		myphone.sendKeys("6379724477");
		WebElement futureadd = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		futureadd.sendKeys("Trichy");
		WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
		register.click();
		
		TakesScreenshot s = (TakesScreenshot) driver;
		File source = s.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\mystore.png");
		FileUtils.copyFile(source, des);
		
		
		
	}

}
