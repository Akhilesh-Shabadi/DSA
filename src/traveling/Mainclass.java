package traveling;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		Stations[] station = { new Stations("Bangalore", 143.9, 170), new Stations("Kengeri", 130.0, 150),
				new Stations("Bidadi", 110.8, 140), new Stations("Maddur", 63.7, 125),
				new Stations("Mandya", 45.0, 100), new Stations("Srirangpatna", 19.1, 40) };
		for (int i = 0; i < station.length; i++) {
			System.out.println(station[i].toString());
		}
		ticketBooking(station);
	}

	static Scanner scanner = new Scanner(System.in);

	static void ticketBooking(Stations[] s1) {
		System.out.println("Number of seat to be book : ");
		int no = scanner.nextInt();
		scanner.nextLine();
		System.out.println("From place : ");
		String fromplace = scanner.nextLine();
		System.out.println("To place : ");
		String toplace = scanner.nextLine();

		for (int i = 0; i < no; i++) {
			System.out.println("Seat number : ");
			int seatno = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter passenger name : ");
			String passenger = scanner.nextLine();
			if (toplace.equalsIgnoreCase("Mysore")) {
				RedBus r1 = new RedBus(fromplace, seatno, passenger, s1);
			} else {
				System.out.println("This bus will go to only Mysore");
			}
		}
	}
}
