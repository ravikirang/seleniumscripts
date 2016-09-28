package TestNG;

import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class ValidateCommands {
	public WebDriver driver;
	public Selenium selenium;
	
  @Test
  public void f() {
	  if(selenium.isElementPresent("Email")){
		  System.out.println("user name is available");
		  selenium.type("Email","coolmouly.143");
	  }
	  else
	  {
		  System.out.println("user name is not available");
		    
	  }
	  
	 /* if(driver.findElement(By.id("Email")).isDisplayed())
	{
		  System.out.println("user name is available");
		  driver.findElement(By.id("Email")).sendKeys("coolmouly.143");
		  		 
	}
	  else
	  {
		  System.out.println("user name is not available");
		    
	  }*/
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("http://gmail.com");
	  selenium = new WebDriverBackedSelenium(driver, "http://gmail.com");
	  driver.manage().window().maximize();
  }

}
