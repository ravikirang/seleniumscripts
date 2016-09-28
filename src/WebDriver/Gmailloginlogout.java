package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailloginlogout {

	public WebDriver driver;
	
	public void openurl()
	{
		driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	}
	
	public void verifylogin()throws Exception
	{
		driver.findElement(By.id("Email")).sendKeys("ravikirangudla");
		driver.findElement(By.id("next")).click();
		Thread.sleep(14000);
		driver.findElement(By.id("Passwd")).sendKeys("9885613180");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(14000);
	}
	public void verifylogout()
	{
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.id("gb_71")).click();
	}
	public static void main(String[] args) throws Exception{
		Gmailloginlogout g = new Gmailloginlogout();
		g.openurl();
		g.verifylogin();
		g.verifylogout();
		

	}

}
