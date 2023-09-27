package pom.without.pagefactory;

import com.base.utils.BaseClass;

public class SearchHotel extends BaseClass{

	public static void selectHotel() {
		selectByVisibleText(findElementBy(SearchHotelLocators.location), "Paris");
		click(findElementById(SearchHotelLocators.search));
	}
}
