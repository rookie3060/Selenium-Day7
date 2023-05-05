package com.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task4 {
	WebDriver driver;
	  @Test
	  
	  public void Login() throws InterruptedException {
		  //WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.driver","c://Drivers//chromedriver.exe" );
			ChromeOptions co =new ChromeOptions();
			co.addArguments("--remote-allow-origin=*");
	        driver=new ChromeDriver(co);
		  String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		  driver.get(url);
		  driver.manage().window().maximize();
	      Thread.sleep(3000);
		  WebElement Username=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	      Username.sendKeys("Admin");
	      WebElement password=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	      password.sendKeys("admin123");
	      WebElement btn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	      btn.click();
	  }
//	  @BeforeMethod
//	  public void setup() {
//		    
//	    
//	  }
	  
	  @Test(dependsOnMethods="Login") 
	  public void Logut() throws InterruptedException{
	Thread.sleep(3000);
	WebElement PC=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
    PC.click();
    WebElement logout=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
    logout.click();
	
}
}