package com.adactin.pages;

import com.adactin.locators.LoginPageLocators;
import com.base.utils.BaseClass;

public class LoginPage extends BaseClass{

	public static void loginWithValidCredentials() {
		try {
			browserOpen("chrome");
			loadUrl("https://adactinhotelapp.com/");
			dataSend(new LoginPageLocators().getUser(), "Muthulakshmi07");
			dataSend(new LoginPageLocators().getPwd(), "Test@123");
			click(new LoginPageLocators().getLoginBtn());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
