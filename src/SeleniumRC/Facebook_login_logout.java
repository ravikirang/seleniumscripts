package SeleniumRC;

import com.thoughtworks.selenium.DefaultSelenium;

public class Facebook_login_logout {
public DefaultSelenium selenium =new DefaultSelenium
("localhost",4444,"*firefox","http://facebook.com");
public void openURL(){
	selenium.start();
	selenium.open("/");
	selenium.windowMaximize();
}
public void verifylogin(){
	selenium.type("email","coolmouly.143@gmail.com");
	selenium.type("pass","princeharish");
	selenium.click("loginbutton");
}
	public void verifylogout()throws Exception{
		Thread.sleep(3000);
		selenium.click("userNavigationLabel");
		selenium.click("html/body/div[18]/div/div/div/div/div[1]/div/div/ul/li[12]/a/span/span");
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Facebook_login_logout f = new Facebook_login_logout();
		f.openURL();
		f.verifylogin();
		f.verifylogout();
	

}
}