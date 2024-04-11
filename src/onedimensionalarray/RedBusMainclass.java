package onedimensionalarray;

public class RedBusMainclass {
	public static void main(String[] args) {
		Redbus redbus=new Redbus(5);
		redbus.ticketbooking(3, "Subhbu");
		redbus.ticketbooking(2, "Akshay");
		redbus.ticketbooking(1, "Bhagya");
		redbus.ticketbooking(4, "Ashish");
		redbus.ticketbooking(2, "Piyush");
		redbus.ticketbooking(6, "Akhil");
		
		redbus.displaylist();
		
		redbus.searchpassenger("Ashish");
		
		redbus.cancelticket(1);
		redbus.displaylist();
	}
}
