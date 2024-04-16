package traveling;

public class Stations {
	private String From_station;
	private String To_station = "Mysore";
	private double distance;
	private int price;

	public Stations(String From_station, double distance, int price) {
		this.From_station = From_station;
		this.distance = distance;
		this.price = price;
	}

	@Override
	public String toString() {
		return "From_station= " + From_station + ",\t To_station=" + To_station + ",\t distance= " + distance
				+ " km, \t price= " + price + " rs";
	}

	public String getFrom_station() {
		return From_station;
	}

	public String getTo_station() {
		return To_station;
	}

	public double getDistance() {
		return distance;
	}

	public int getPrice() {
		return price;
	}

}
