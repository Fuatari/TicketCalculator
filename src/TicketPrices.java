import java.util.HashMap;

public class TicketPrices {

	HashMap<Integer, Customer> ticketMap = new HashMap<Integer, Customer>();

	public Customer createCustomer(String type, int price) {
		Customer customer = new Customer(type, price);
		return customer;
	}

	public void addCustomerType(int id, Customer customer) {
		ticketMap.put(id, customer);
	}

	public void setTicketPrices() {
		addCustomerType(1, createCustomer("Standard", 8));
		addCustomerType(2, createCustomer("OAP", 6));
		addCustomerType(3, createCustomer("Student", 6));
		addCustomerType(4, createCustomer("Child", 4));
	}

	public void printPrices() {
		System.out.println(ticketMap.toString());
	}

	public void printPrettyPrices() {
		for (int i = 1; i <= ticketMap.size(); i++) {
			System.out.println("(" + i + ") " + ticketMap.get(i).getType() + ": ’" + ticketMap.get(i).getPrice());
		}
	}

	public int getCustomerPrice(String type) {
		int price = 0;
		for (int i = 1; i <= ticketMap.size(); i++) {
			if (ticketMap.get(i).getType().equalsIgnoreCase(type)) {
				price = ticketMap.get(i).getPrice();
			}
		}
		return price;
	}

}
