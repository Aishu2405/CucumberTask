package pom.without.pagefactory;

import org.junit.Test;

public class SearchHotelTest {

	@Test
	public void select_hotel() {
		LoginPage.loginMethod();
		SearchHotel.selectHotel();
	}
}
