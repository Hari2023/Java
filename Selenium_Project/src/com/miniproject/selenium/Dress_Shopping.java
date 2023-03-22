package com.miniproject.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dress_Shopping {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("haribask@gmail.com");
		WebElement passwd = driver.findElement(By.xpath("//input[@name='passwd']"));
		passwd.sendKeys("Hari2023");
		WebElement signin = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		signin.click();
		WebElement dress = driver.findElement(By.xpath("(//a[.='Dresses'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(dress).build().perform();
		WebElement run = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
		a.click(run).build().perform();
		WebElement quic = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
		a.moveToElement(quic).build().perform();
		a.click(quic).build().perform();
		Thread.sleep(5000);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(iframe);
		WebElement qty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int i = 1; i <= 3; i++) {
			qty.click();

		}
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select b = new Select(size);
		b.selectByValue("3");
		WebElement cart = driver.findElement(By.xpath("//button[@name='Submit']"));
		cart.click();
		driver.switchTo().defaultContent();
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed.click();
		WebElement proceed2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed2.click();
		WebElement proceed3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		proceed3.click();
		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		check.click();
		WebElement carrier = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		carrier.click();
		WebElement pay = driver.findElement(By.xpath("//a[@class='bankwire']"));
		pay.click();
		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		JavascriptExecutor hb = (JavascriptExecutor) driver;
		hb.executeScript("arguments[0].scrollIntoView()", confirm);
		hb.executeScript("arguments[0].click()", confirm);
		//confirm.click();
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\order.png");
		FileUtils.copyFile(src, des);
		WebElement orders = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", orders);
		js.executeScript("arguments[0].click()", orders);
		Thread.sleep(3000);
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\finalorder.png");
		FileUtils.copyFile(src1, des1);
		Thread.sleep(4000);
		WebElement dress2 = driver.findElement(By.xpath("(//a[.='Dresses'])[2]"));
		a.moveToElement(dress2).build().perform();
		WebElement even_Dress = driver.findElement(By.xpath("(//a[.='Evening Dresses'])[2]"));
		a.click(even_Dress).build().perform();
		WebElement quick2 = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
		a.moveToElement(quick2).build().perform();
		a.click(quick2).build().perform();
		WebElement iframe2 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(iframe2);
		WebElement qty2 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int i = 0; i <= 2; i++) {
			qty2.click();
		}
		WebElement size2 = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s2 = new Select(size2);
		s2.selectByValue("2");
		WebElement color = driver.findElement(By.xpath("//a[@title='Pink']"));
		color.click();
		WebElement cart2 = driver.findElement(By.xpath("//button[@name='Submit']"));
		cart2.click();
		driver.switchTo().defaultContent();
		WebElement pro1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		pro1.click();
		WebElement pro2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		pro2.click();
		WebElement pro3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		pro3.click();
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		WebElement pro4 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		pro4.click();
		WebElement cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
		cheque.click();
		WebElement confm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confm.click();
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File sroc = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\order2.png");
		FileUtils.copyFile(sroc, dest);
		WebElement order1 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", order1);
		jse.executeScript("arguments[0].click()", order1);
		Thread.sleep(3000);
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File srce = ts3.getScreenshotAs(OutputType.FILE);
		File desn = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\finalorder2.png");
		FileUtils.copyFile(srce, desn);
		Thread.sleep(4000);
		WebElement dress3 = driver.findElement(By.xpath("(//a[.='Dresses'])[2]"));
		a.moveToElement(dress3).build().perform();
		WebElement summer = driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[2]"));
		a.click(summer).build().perform();
		WebElement quic3 = driver.findElement(By.xpath("(//a[@title='Printed Summer Dress'])[2]"));
		a.moveToElement(quic3).build().perform();
		a.click(quic3).build().perform();
		WebElement iframe3 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(iframe3);
		WebElement qty3 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int i = 0; i <= 2; i++) {
			qty3.click();
		}
		WebElement size3 = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select n = new Select(size3);
		n.selectByValue("3");
		WebElement color2 = driver.findElement(By.xpath("//a[@title='Blue']"));
		color2.click();
		WebElement cart3 = driver.findElement(By.xpath("//button[@name='Submit']"));
		cart3.click();
		WebElement proc1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proc1.click();
		WebElement proc2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proc2.click();
		WebElement proc3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		proc3.click();
		WebElement chck = driver.findElement(By.xpath("//input[@type='checkbox']"));
		chck.click();
		WebElement process = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		process.click();
		WebElement pay2 = driver.findElement(By.xpath("//a[@class='bankwire']"));
		pay2.click();
		WebElement confm3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confm3.click();
		TakesScreenshot st = (TakesScreenshot) driver;
		File sr = st.getScreenshotAs(OutputType.FILE);
		File dt = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\order3.png");
		FileUtils.copyFile(sr, dt);
		WebElement order3 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView()", order3);
		je.executeScript("arguments[0].click()", order3);
		Thread.sleep(3000);
		TakesScreenshot ss = (TakesScreenshot) driver;
		File sre = ss.getScreenshotAs(OutputType.FILE);
		File detn = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\finalorder3.png");
		FileUtils.copyFile(sre, detn);
		WebElement logout = driver.findElement(By.xpath("//a[@class='logout']"));
		logout.click();

	}

}
