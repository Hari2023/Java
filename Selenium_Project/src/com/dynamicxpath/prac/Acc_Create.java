package com.dynamicxpath.prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Acc_Create {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement sign = driver.findElement(By.xpath("//a[@class='login']//parent::div"));
		sign.click();
		WebElement email = driver.findElement(By.xpath("//input[@type='text' and @name='email_create' ]"));
		email.sendKeys("haribasn@gmail.com");
		WebElement create = driver.findElement(By.xpath("//button[@type='submit' and @name='SubmitCreate']"));
		create.click();
		WebElement rdo_Btn = driver.findElement(By.xpath("//input[@type='radio' and @id='id_gender1']"));
		rdo_Btn.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@type='text' and @name='customer_firstname']"));
		firstname.sendKeys("HariBaskar");
		WebElement lastname = driver.findElement(By.xpath("//input[@type='text' and @name='customer_lastname']"));
		lastname.sendKeys("G");
		WebElement pass = driver.findElement(By.xpath("//div[@class='required password form-group']//child::input"));
		pass.sendKeys("Hari2023");//Hari23@#

		WebElement days = driver.findElement(By.xpath("//div[@class='selector']//child::select[@name='days']"));

		WebElement month = driver.findElement(By.xpath("//div[@id='uniform-months']//child::select[@name='months']"));

		WebElement year = driver.findElement(By.xpath("//div[@id='uniform-years']//child::select[@name='years']"));

		Select a = new Select(days);
		a.selectByValue("19");
		Select b = new Select(month);
		b.selectByValue("10");
		Select c = new Select(year);
		c.selectByValue("2022");

		WebElement company = driver
				.findElement(By.xpath("//div[@class='account_creation']//child::input[@name='company']"));
		company.sendKeys("Wipro");

		WebElement address = driver.findElement(
				By.xpath("//div[@class='account_creation']//child::input[@name='address1' and @id='address1']"));
		address.sendKeys("OMR");

		WebElement add2 = driver.findElement(
				By.xpath("//div[@class='account_creation']//child::input[@name='address2' and @id='address2']"));
		add2.sendKeys("Chennai,Tamil Nadu");

		WebElement city = driver.findElement(By.xpath("//div[@class='account_creation']//child::input[@name='city']"));
		city.sendKeys("Chennai");

		WebElement state = driver.findElement(By.xpath("//div[@class='selector']//child::select[@name='id_state' ]"));
		Select d = new Select(state);
		d.selectByValue("31");

		WebElement postcod = driver.findElement(By
				.xpath("//p[@class='required postcode form-group']//child::input[@name='postcode' and @type='text']"));
		postcod.sendKeys("12345");

		WebElement united = driver
				.findElement(By.xpath("//div[@id='uniform-id_country']//child::select[@name='id_country']"));
		Select e = new Select(united);
		e.selectByValue("21");

		WebElement additional = driver
				.findElement(By.xpath("//p[@class='textarea form-group']//child::textarea[@name='other']"));
		additional.sendKeys("Purchase");

		WebElement home = driver.findElement(By.xpath("//p[@class='form-group']//child::input[@name='phone']"));
		home.sendKeys("7502530951");

		WebElement personal = driver.findElement(
				By.xpath("//p[@class='required form-group']//child::input[@type='text' and @name='phone_mobile']"));
		personal.sendKeys("6379724477");

		WebElement future_Add = driver.findElement(By.xpath("//p[@id='address_alias']//child::input[@type='text']"));
		future_Add.sendKeys("Trichy");

		WebElement register = driver
				.findElement(By.xpath("//div[@class='submit clearfix']//child::button[@id='submitAccount']"));
		register.click();

	}

}
