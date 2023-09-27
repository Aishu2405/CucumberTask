package com.adactin.test;

import org.junit.Test;

import com.adactin.pages.LoginPage;

public class LoginPageTest {

	@Test
	public void userLogin() {
		LoginPage.loginWithValidCredentials();
	}
}
