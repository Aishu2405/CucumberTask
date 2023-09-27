package com.adactin.test;

import org.junit.Test;

import com.adactin.pages.LoginPage;
import com.adactin.pages.SearchHotelPage;

public class SearchHotelPageTest {

	@Test
	public void validate_user_able_to_select_hotel() {
		LoginPage.loginWithValidCredentials();
		SearchHotelPage.selectHotel();
	}
}
