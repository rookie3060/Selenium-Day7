package com.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task5_2{
	WebDriver driver;
  @BeforeSuite
  public void open()
  {
	  //WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.chrome.driver","c://Drivers//chromedriver.exe" );
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
    driver=new ChromeDriver(co);
  }

@Test
  public void Testcase_01() {
	  
	  String ur="https://www.godaddy.com/";
	  driver.get(ur);
	  driver.manage().window().maximize();
	  String title=driver.getTitle();
      String expectedtitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
      Assert.assertEquals(title, expectedtitle);
      String url=driver.getCurrentUrl();
      String expec_url="https://www.godaddy.com/en-in";
      Assert.assertEquals(url, expec_url);
	  driver.quit();
	  
 }
@SuppressWarnings("deprecation")
  @Test
  public void Testcase_02() 
  { 
	    
	    //WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver","c://Drivers//chromedriver.exe" );
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
        driver=new ChromeDriver(co);
        String ur="https://www.godaddy.com/";
        driver.get(ur);
      driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
//        WebElement bn=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/button"));
//	    bn.click();      
	    WebElement btn=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button"));
	    btn.click();
	    WebElement dns=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a"));
		dns.click();
	    		
  }
}