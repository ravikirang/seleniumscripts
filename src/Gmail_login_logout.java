import com.thoughtworks.selenium.DefaultSelenium;

public class Gmail_login_logout {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		DefaultSelenium selenium = new DefaultSelenium
     	("localhost",4444,"*firefox","http://gmail.com");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.type("Email","coolmouly.143");
		selenium.click("next");
		Thread.sleep(3000);
		selenium.type("Passwd", "princeharish");
		selenium.click("signIn");
		Thread.sleep(20000);
		selenium.click("css = click.gb_1a gbii");
		selenium.click("gb_71");
		}
}