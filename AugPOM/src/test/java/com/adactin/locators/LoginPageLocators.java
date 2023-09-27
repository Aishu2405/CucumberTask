package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class LoginPageLocators extends BaseClass {
	
//	LoginPageLocators lp = new LoginPageLocators();
	
	public LoginPageLocators() {
		PageFactory.initElements(driver, this); 
		//initElements() used to initialize the WebElement
	}

	@FindBy(id="username") //-> used to find the element
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(className="login_button")
	private WebElement loginBtn;

	//@FindBys based on &&
//	@FindBys({
//		@FindBy(id="username"),
//		@FindBy(className="login_input")
//	})
//	private WebElement userNameBys;
//	
//	//@FindAll based on ||
//	@FindAll({
//		@FindBy(id="username"),
//		@FindBy(className="login_input")
//	})
	
	public WebElement getUser() {
		return user;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
}
