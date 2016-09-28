package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class xe {
	public WebDriver driver;
	
	public void openurl(){
		driver = new FirefoxDriver();
		driver.get("http://xe.com");
		driver.manage().window().maximize();
	}
public void verifyurl()throws Exception
{
	driver.findElement(By.id("amount")).sendKeys("100");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath(".//*[@id='from_scroller']/li[3]"))).selectByVisibleText("GBP - British Pound");
	driver.findElement(By.xpath(".//*[@id='inverseBtn']//a")).click();
	new Select(driver.findElement(By.xpath(".//*[@id='to_scroller']/li[4]"))).selectByVisibleText("INR - Indian Rupee");
	driver.findElement(By.xpath(".//*[@id='ucc_go_btn_svg']/a/g[2]/circle")).click();
}
	public static void main(String[] args)throws Exception {
		xe x= new xe();
		x.openurl();
		x.verifyurl();
				

	}

}
