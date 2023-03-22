package com.dynamicxpath.prac;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

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

public class Dress_Selection {
	
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement sign = driver.findElement(By.xpath("//div[@class='header_user_info']//child::a"));
		sign.click();
		WebElement email = driver.findElement(By.xpath("//div[@class='form-group']//child::input[@name='email' and @id='email']"));
		email.sendKeys("haribasn@gmail.com");
		WebElement passwd = driver.findElement(By.xpath("//div[@class='form-group']//child::input[@name='passwd']"));
		passwd.sendKeys("Hari2023");
		WebElement signin = driver.findElement(By.xpath("//p[@class='submit']//child::button[@type='submit']"));
		signin.click();
		WebElement dress = driver.findElement(By.xpath("//a[@title='Dresses']//following::a[text()='Dresses']"));
		Actions a = new Actions(driver);
		a.moveToElement(dress).build().perform();
		WebElement run = driver.findElement(By.xpath("//a[@title='Casual Dresses']//following::a[.='Casual Dresses']"));
		a.click(run).build().perform();
		WebElement quic = driver.findElement(By.xpath("//div[@class='product-image-container']//child::a[@title='Printed Dress']"));
		a.moveToElement(quic).build().perform();
		a.click(quic).build().perform();
		Thread.sleep(5000);
		WebElement iframe = driver.findElement(By.xpath("//div[@class='fancybox-inner']//child::iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(iframe);
		WebElement qty = driver.findElement(By.xpath("//a[@data-field-qty='qty']//child::i[@class='icon-plus']"));
		for (int i = 1; i <= 3; i++) {
			qty.click();

		}
		WebElement size = driver.findElement(By.xpath("//div[@id='uniform-group_1']//child::select[@name='group_1']"));
		Select b = new Select(size);
		b.selectByValue("3");
		WebElement cart = driver.findElement(By.xpath("//button[@name='Submit']//parent::p[@class='buttons_bottom_block no-print']"));
		cart.click();
		driver.switchTo().defaultContent();
		WebElement proceed = driver.findElement(By.xpath("//div[@class='button-container']//child::a[@title='Proceed to checkout']"));
		proceed.click();
		WebElement proceed2 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::a[@title='Proceed to checkout']"));
		proceed2.click();
		WebElement proceed3 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@name='processAddress']"));
		proceed3.click();
		WebElement check = driver.findElement(By.xpath("//div[@class='checker']//child::input[@type='checkbox']"));
		check.click();
		WebElement carrier = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//ancestor::button[@name='processCarrier']"));
		carrier.click();
		WebElement pay = driver.findElement(By.xpath("//a[@class='bankwire']//parent::p[@class='payment_module']"));
		pay.click();
		WebElement confirm = driver.findElement(By.xpath("//p[@id='cart_navigation']//child::button[@type='submit']"));
		JavascriptExecutor hb = (JavascriptExecutor) driver;
		hb.executeScript("arguments[0].scrollIntoView()", confirm);
		hb.executeScript("arguments[0].click()", confirm);
		//confirm.click();
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\order.png");
		FileUtils.copyFile(src, des);
		WebElement orders = driver.findElement(By.xpath("//p[@class='cart_navigation exclusive']//child::a[@title='Back to orders']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", orders);
		js.executeScript("arguments[0].click()", orders);
		Thread.sleep(3000);
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\finalorder.png");
		FileUtils.copyFile(src1, des1);
		Thread.sleep(4000);
		
		WebElement dress2 = driver.findElement(By.xpath("//a[@title='Dresses']//following::a[text()='Dresses']"));
		a.moveToElement(dress2).build().perform();
		
		WebElement even_Dress = driver.findElement(By.xpath("//a[@title='Evening Dresses']//following::a[.='Evening Dresses']"));
		a.click(even_Dress).build().perform();
		WebElement quick2 = driver.findElement(By.xpath("//div[@class='product-image-container']//child::a[@title='Printed Dress']"));
		a.moveToElement(quick2).build().perform();
		a.click(quick2).build().perform();
		WebElement iframe2 = driver.findElement(By.xpath("//div[@class='fancybox-inner']//child::iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(iframe2);
		WebElement qty2 = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::i[@class='icon-plus']"));
		for (int i = 0; i <= 2; i++) {
			qty2.click();
		}
		WebElement size2 = driver.findElement(By.xpath("//div[@class='selector']//child::select[@name='group_1']"));
		Select s2 = new Select(size2);
		s2.selectByValue("2");
		WebElement color = driver.findElement(By.xpath("//a[@title='Pink']//ancestor::ul[@id='color_to_pick_list']"));
		color.click();
		WebElement cart2 = driver.findElement(By.xpath("//button[@name='Submit']//parent::p[@class='buttons_bottom_block no-print']"));
		cart2.click();
		driver.switchTo().defaultContent();
		WebElement pro1 = driver.findElement(By.xpath("//div[@class='button-container']//child::a[@title='Proceed to checkout']"));
		pro1.click();
		WebElement pro2 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::a[@title='Proceed to checkout']"));
		pro2.click();
		WebElement pro3 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@name='processAddress']"));
		pro3.click();
		WebElement checkbox = driver.findElement(By.xpath("//p[@class='checkbox']//child::input[@type='checkbox']"));
		checkbox.click();
		WebElement pro4 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@name='processCarrier']"));
		pro4.click();
		WebElement cheque = driver.findElement(By.xpath("//p[@class='payment_module']//child::a[@class='cheque']"));
		cheque.click();
		WebElement confm = driver.findElement(By.xpath("//p[@id='cart_navigation']//button[@type='submit']"));
		confm.click();
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File sroc = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\order2.png");
		FileUtils.copyFile(sroc, dest);
		WebElement order1 = driver.findElement(By.xpath("//p[@class='cart_navigation exclusive']//child::a[@title='Back to orders']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", order1);
		jse.executeScript("arguments[0].click()", order1);
		Thread.sleep(3000);
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File srce = ts3.getScreenshotAs(OutputType.FILE);
		File desn = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\finalorder2.png");
		FileUtils.copyFile(srce, desn);
		Thread.sleep(4000);
		WebElement dress3 = driver.findElement(By.xpath("//a[@title='Dresses']//following::a[text()='Dresses']"));
		a.moveToElement(dress3).build().perform();
		WebElement summer = driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[2]"));
		a.click(summer).build().perform();
		WebElement quic3 = driver.findElement(By.xpath("//div[@class='product-image-container']//child::a[@title='Printed Chiffon Dress']"));
		a.moveToElement(quic3).build().perform();
		a.click(quic3).build().perform();
		WebElement iframe3 = driver.findElement(By.xpath("//div[@class='fancybox-inner']//child::iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(iframe3);
		WebElement qty3 = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::i[@class='icon-plus']"));
		for (int i = 0; i <= 2; i++) {
			qty3.click();
		}
		WebElement size3 = driver.findElement(By.xpath("//div[@class='selector']//child::select[@name='group_1']"));
		Select n = new Select(size3);
		n.selectByValue("3");
		WebElement color2 = driver.findElement(By.xpath("//a[@title='Yellow']//ancestor::ul[@id='color_to_pick_list']"));
		color2.click();
		WebElement cart3 = driver.findElement(By.xpath("//button[@name='Submit']//parent::p[@class='buttons_bottom_block no-print']"));
		cart3.click();
		WebElement proc1 = driver.findElement(By.xpath("//div[@class='button-container']//child::a[@title='Proceed to checkout']"));
		proc1.click();
		WebElement proc2 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::a[@title='Proceed to checkout']"));
		proc2.click();
		WebElement proc3 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@name='processAddress']"));
		proc3.click();
		WebElement chck = driver.findElement(By.xpath("//p[@class='checkbox']//child::input[@type='checkbox']"));
		chck.click();
		WebElement process = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@name='processCarrier']"));
		process.click();
		WebElement pay2 = driver.findElement(By.xpath("//a[@class='bankwire']//parent::p[@class='payment_module']"));
		pay2.click();
		WebElement confm3 = driver.findElement(By.xpath("//p[@id='cart_navigation']//child::button[@type='submit']"));
		confm3.click();
		TakesScreenshot st = (TakesScreenshot) driver;
		File sr = st.getScreenshotAs(OutputType.FILE);
		File dt = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\order3.png");
		FileUtils.copyFile(sr, dt);
		WebElement order3 = driver.findElement(By.xpath("//p[@class='cart_navigation exclusive']//child::a[@title='Back to orders']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView()", order3);
		je.executeScript("arguments[0].click()", order3);
		Thread.sleep(3000);
		TakesScreenshot ss = (TakesScreenshot) driver;
		File sre = ss.getScreenshotAs(OutputType.FILE);
		File detn = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\finalorder3.png");
		FileUtils.copyFile(sre, detn);
		WebElement logout = driver.findElement(By.xpath("//div[@class='header_user_info']//child::a[@class='logout']"));
		logout.click();


	}

}
