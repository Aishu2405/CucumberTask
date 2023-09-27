package pom.without.pagefactory;

import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

public class LoginPage extends BaseClass{

	public static LoginLocators login = new LoginLocators();
	
	public static void loginMethod() {
		
		browserOpen("chrome");
		loadUrl("https://adactinhotelapp.com/");
		WebElement user = findElementBy(login.username);
		dataSend(user, "Muthulakshmi07");		
		dataSend(findElementBy(login.password), "Test@123");
//		click(findElementBy(login.login));
		click(findElementById(login.loginBtn));
	}
}
