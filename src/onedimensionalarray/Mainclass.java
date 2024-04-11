package onedimensionalarray;

public class Mainclass {
	public static void main(String[] args) {
		SDA sda=new SDA(5);
		sda.insertionSDA(1, 20);
		sda.insertionSDA(3, 40);
		sda.insertionSDA(2, 30);
		sda.insertionSDA(1, 10);
		sda.insertionSDA(6, 70);
		
		sda.trverse();
		sda.searchingSDA(40);
		sda.deletionSDA(30);
		sda.trverse();
	}
}
