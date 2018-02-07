import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TicketCalcTest {

	TicketCalculator ticketCalc = new TicketCalculator();

	@Test
	void nonWednesdayPrices() {
		int totalCost = 0;
		assertEquals(18, totalCost);
	}

	void wednesdayPrices() {
		int totalCost = 0;
		assertEquals(16, totalCost);
	}

}
