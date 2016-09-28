package WebDriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	import com.google.common.annotations.VisibleForTesting;

	public class spicejet {
		
	public WebDriver driver;
	public void openurl()
	{
	driver = new FirefoxDriver();
	driver.get("http://spicejet.com");
	driver.manage().window().maximize();
	}

	public void verifyonewaysearch()throws Exception
	{
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.linkText("Hyderabad (HYD)")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	driver.findElement(By.linkText("Bengaluru (BLR)")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[3]/a")).click();
	new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("3 Adults");
	new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("2 Children");
	new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("1 Infant");
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
   public void verifypopup()throws Exception{
	   @SuppressWarnings("unused")
	String str;
	   str = driver.getWindowHandle();
	   driver.findElement(By.xpath(".//*[@id='popUpConverter']")).click();
	   Thread.sleep(3000);
	   driver.switchTo().window("converter");
	   new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).
	                                                                    selectByVisibleText("US Dollars(USD)");
	   new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency")))
	                                                                .selectByVisibleText("Indian Rupee(INR)");
	   driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("100");
	   driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
	   driver.findElement(By.id("ButtonCloseWindow")).click();
   }
	public static void main(String[] args) throws Exception {
		spicejet s = new spicejet();
		s.openurl();
		s.verifyonewaysearch();
		s.verifypopup();
}

	}


