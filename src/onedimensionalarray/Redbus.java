package onedimensionalarray;

public class Redbus {
	String[] passanger;

	public Redbus(int numberSeates) {
		passanger = new String[numberSeates];
	}

	public void ticketbooking(int seatnumber, String passengername) {
		try {
			if (passanger[seatnumber] == null) {
				passanger[seatnumber] = passengername;
				System.out.println("Seatnumber "+seatnumber + " is booked to passanger " + passengername);
			} else {
				System.out.println("The seat " + seatnumber + " is already booked");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid seatnumber or name");
		}
	}

	public void displaylist() {
		for (int i = 0; i < passanger.length; i++) {
			System.out.println(passanger[i]);
		}
	}

	public void searchpassenger(String name) {
		for (int i = 0; i < passanger.length; i++) {
			if(passanger[i]==name) {
				System.out.println("The passanger "+name+" is booked seatnumber "+i);
				return;
			}
		}
		System.out.println("The passanger "+name+" is not present");
	}
	
	public void cancelticket(int seatnumber) {
		try {
			if(passanger[seatnumber]!=null) {
				passanger[seatnumber]=null;
				System.out.println("The booked seatnumber "+seatnumber+" is canceled");
			} else {
				System.out.println("The seatnumber "+seatnumber+" is already deleted");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid seatnumber");
		}
	}
}
