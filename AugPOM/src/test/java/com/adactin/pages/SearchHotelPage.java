package com.adactin.pages;

import com.adactin.locators.SearchHotelPageLocators;
import com.base.utils.BaseClass;

public class SearchHotelPage extends BaseClass{

	public static void selectHotel() {
		try {
			selectByVisibleText(new SearchHotelPageLocators().getLocations(), "Sydney");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
