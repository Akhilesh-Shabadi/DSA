package traveling;

public class RedBus {
	static String[] passenger = new String[20];

	public RedBus(String fromstation, int seatno, String passengername, Stations[] s1) {
		bookingticket(fromstation, seatno, passengername, s1);
	}

	void bookingticket(String fromstation, int seatno, String passengername, Stations[] s1) {
		if (passenger[seatno - 1] == null) {
			passenger[seatno - 1] = passengername;
			System.out.println("Your ticket is booked successfully");
		}
		for (int i = 1; i < s1.length; i++) {
			if (fromstation.equalsIgnoreCase(s1[i].getFrom_station())) {
				System.out.println(passengername + " Your ticket is Booked Successfully");
				System.out.println("From " + s1[i].getFrom_station() + " To " + s1[i].getTo_station()
						+ " and the distance is " + s1[i].getDistance() + " And Total Amount is " + s1[i].getPrice());
				System.out.println("-------Happy journey-------");
				return;
			} else {
				System.out.println("Invalid place");
			}
		}
	}
}
