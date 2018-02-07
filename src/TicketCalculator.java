import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TicketCalculator {

	TicketPrices tickets = new TicketPrices();

	Scanner scanner = new Scanner(System.in);

	public void newTransaction() {
		tickets.setTicketPrices();
		tickets.printPrettyPrices();

		int total = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print("Choose a ticket to purchase: ");
			String input = findNextTicket(scanner.nextLine());
			System.out.print("Added " + input + " ticket: ’" + tickets.getCustomerPrice(input));
			total += tickets.getCustomerPrice(input);
			System.out.println(", Current total: ’" + total);
		}

		System.out.println("Total Price: ’" + wedsDiscount(total));
	}

	public boolean itIsWednesday() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		boolean wedCheck = false;
		if (new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime()).equalsIgnoreCase("Wed"))
			wedCheck = true;
		return wedCheck;
	}

	public int wedsDiscount(int total) {
		if (itIsWednesday()) {
			total -= 6;
			System.out.println("Wednesday discount!");
		}
		return total;
	}

	public String findNextTicket(String input) {
		String type = "0";

		while (type == "0") {
			if (input.startsWith("Sta") || (input.startsWith("sta")) || input.startsWith("1"))
				type = "standard";
			else if (input.startsWith("O") || (input.startsWith("o")) || input.startsWith("2"))
				type = "OAP";
			else if (input.startsWith("Stu") || (input.startsWith("stu")) || input.startsWith("3"))
				type = "student";
			else if (input.startsWith("C") || (input.startsWith("c")) || input.startsWith("4"))
				type = "child";
			else {
				System.out.println("Please choose a valid ticket type");
			}
		}
		return type;
	}
}
