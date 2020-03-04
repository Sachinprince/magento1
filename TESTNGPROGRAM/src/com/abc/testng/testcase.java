package com.abc.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase {
@Test
public	void PositiveTestcase() throws Exception  {
	String url="https://www.magento.com";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get(url);
	driver.findElement(By.linkText("My Account")).click();
	WebElement  mail = driver.findElement(By.id( "email"));
	mail.sendKeys( "kcpkaranth@gmail.com");
	WebElement  pwd = driver.findElement(By.id("pass"));
	pwd.sendKeys( "welcome#123");
	driver.findElement(By.id("send2")).click();
	driver.findElement(By.linkText("Log Out")).click();
Thread.sleep(2000);
driver.close();
 
	
	}
	
	
	@Test
	public void NegativeTestcase() throws Exception{
		String url="https://www.magento.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		WebElement  mail = driver.findElement(By.id( "email"));
		mail.sendKeys( "kcpkaranth@gmail.com");
		WebElement  pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys( "getlost123");
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(2000);
	driver.close();
		
	}
	

}
