package com.dynamicxpath.prac;

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

public class Adacatin_Hotel {
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Haribaskar1234");
		WebElement passwd = driver.findElement(By.xpath("//input[@name='password']"));
		passwd.sendKeys("3x@HgypsH76zHb");
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select a = new Select(location);
		a.selectByValue("New York");
		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select b = new Select(hotels);
		b.selectByValue("Hotel Sunshine");
		WebElement room_Type = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select c = new Select(room_Type);
		c.selectByValue("Super Deluxe");
		WebElement noOfRooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select d = new Select(noOfRooms);
		d.selectByVisibleText("2 - Two");
		WebElement checkIn = driver.findElement(By.xpath("//input[@type='text' and @id='datepick_in']"));
		checkIn.clear();
		checkIn.sendKeys("15/10/2022");
		WebElement checkOut = driver.findElement(By.xpath("//input[@type='text' and @name='datepick_out']"));
		checkOut.clear();
		checkOut.sendKeys("16/10/2022");
		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select e = new Select(adult);
		e.selectByValue("2");
		WebElement childRoom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select f = new Select(childRoom);
		f.selectByValue("0");
		WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
		search.click();
		WebElement radio_Btn = driver.findElement(By.xpath("//input[@type='radio']"));
		radio_Btn.click();
		WebElement move = driver.findElement(By.xpath("//input[@name='continue']"));
		move.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name' and @class='reg_input']"));
		firstname.sendKeys("NANDHU");
		WebElement lastnam = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastnam.sendKeys("G");
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("TRICHY");
		WebElement cardnum = driver.findElement(By.xpath("//input[@name='cc_num']"));
		cardnum.sendKeys("1234567891234567");
		WebElement creditcard = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select g = new Select(creditcard);
		g.selectByValue("VISA");
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select h = new Select(month);
		h.selectByValue("10");
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select i = new Select(year);
		i.selectByValue("2022");
		WebElement ccvNum = driver.findElement(By.xpath("//input[@name='cc_cvv' and @type='text' ]"));
		ccvNum.sendKeys("123");
		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		book.click();
		WebElement iternity = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		iternity.click();
		WebElement check_All = driver.findElement(By.xpath("//input[@name='check_all']"));
		check_All.click();
		WebElement cancel_All = driver.findElement(By.xpath("//input[@name='cancelall']"));
		cancel_All.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\hotel.png");
		FileUtils.copyFile(src, des);
		
		
//		Alert s = driver.switchTo().alert();
//		s.accept();
	}

}
