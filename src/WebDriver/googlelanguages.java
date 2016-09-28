package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlelanguages {
	public WebDriver driver;
	public void openurl()
	{
		driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}
   public void clicklink(String str)throws Exception
   {
	   driver.findElement(By.xpath(str)).click();
	   Thread.sleep(3000);
	   driver.findElement(By.linkText("English")).click();
	   Thread.sleep(3000);
   }
	public static void main(String[] args) throws Exception {
		
		googlelanguages g = new googlelanguages();
		g.openurl();
		g.clicklink("//*[@id='_eEe']/a[1]");
		g.clicklink("//*[@id='_eEe']/a[2]");
		g.clicklink("//*[@id='_eEe']/a[3]");

	}

}
