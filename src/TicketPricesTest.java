import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TicketPricesTest {

	static TicketPrices prices = new TicketPrices();

	@BeforeAll
	static void beforeAll() {
		prices.setTicketPrices();
	}

	@Test
	void confirmStandardPrice() {
		assertEquals(8, prices.getCustomerPrice("Standard"));
	}

	@Test
	void confirmOAPPrice() {
		assertEquals(6, prices.getCustomerPrice("OAP"));
	}

	@Test
	void confirmStudentPrice() {
		assertEquals(6, prices.getCustomerPrice("Student"));
	}

	@Test
	void confirmChildPrice() {
		assertEquals(4, prices.getCustomerPrice("Child"));
	}
}
