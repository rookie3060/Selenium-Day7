package com.day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 {
  @Test
  public void Google() {
	  System.setProperty("webdriver.chrome.driver","c://Drivers//chromedriver.exe" );
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="Guest Registration Form – User Registration";
		Assert.assertEquals(actualtitle,expectedtitle);

  }
}
