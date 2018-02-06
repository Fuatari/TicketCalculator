
public class Customer {

	private String type;
	private int price;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Customer(String type, int price) {
		this.type = type;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[ Customer type = " + type + ", Ticket price=" + price + " ]";
	}
}
