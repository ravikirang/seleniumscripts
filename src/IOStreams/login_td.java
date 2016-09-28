package IOStreams;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class login_td {
	public WebDriver driver;
  @Test
  public void f()throws Exception {
	  FileInputStream fi = new FileInputStream("D:\\ravi selenium\\Test Data\\login.xls");
	  Workbook w = Workbook.getWorkbook(fi);
	  Sheet s =w.getSheet("sheet1");
	  System.out.println(s.getCell(0,1).getContents());
	  System.out.println(s.getCell(1,1).getContents() );
	  driver.findElement(By.id("Email")).sendKeys(s.getCell(0,1).getContents()); 
	  driver.findElement(By.id("next")).click(); 
	  Thread.sleep(3000);
	  driver.findElement(By.id("Passwd")).sendKeys(s.getCell(1,1).getContents());
	  driver.findElement(By.id("signIn")).click();
  }
  @BeforeTest 
  public void beforeTest() {
	  driver= new FirefoxDriver();
	  driver.get("http://gmail.com");
	  driver.manage().window().maximize();
  }

}
