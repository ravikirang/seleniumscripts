package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class irctc {
public WebDriver driver;
public void openurl()
{
	driver = new FirefoxDriver();
	driver.get("http://irctc.co.in");
	driver.manage().window().maximize();
}
public void verifyurl()
{
	//driver.findElement(by.)
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
