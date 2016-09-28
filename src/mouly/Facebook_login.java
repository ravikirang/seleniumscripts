package mouly;

import com.thoughtworks.selenium.DefaultSelenium;

public class Facebook_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultSelenium selenium = new DefaultSelenium
		("localhost",4444,"firefox","http://facebook.com");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.type("email", "coolmouly.143@gmail.com");
		selenium.type("pass", "princeharish");
		selenium.click("u_o_w");
		

	}
		
	}

