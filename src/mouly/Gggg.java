package mouly;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Gggg {

	
		
		public WebDriver driver;
		
		public void ff(){
			driver=new FirefoxDriver();//Launches FF
			driver.get("http://gmail.com");
			driver.manage().window().maximize();
		}
		public void opera(){
			driver=new OperaDriver();
			driver.get("URL");
		}
		public void safari(){
			driver=new SafariDriver();
			driver.get("URL");
		}
		
		public void chrome(){
			System.setProperty("webdriver.chrome.driver", 
										"D:\\library\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://spicejet.com");
			
		}
		
		public void ie(){
			System.setProperty("webdriver.ie.driver", 
										"D:\\library\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get("http://google.com");
		}

		public static void main(String[] args) {
			
			Gggg a=new Gggg();
			a.ff();
			//a.opera();
			//a.safari();
			a.chrome();
			a.ie();
		}


}
