package TestNG;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class Aboutus {
	public WebDriver driver;
	public Screen s;
	
  @Test
  public void f() throws Exception{
	   s.click("D:\\library.sikuli\\.1461869780930.png");
	   Thread.sleep(3000);
	   driver.findElement(By.linkText("Careers ")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  s = new Screen();
	  driver.manage().window().maximize();
  }

}
