package twodimensionalarray;

public class Mainclass {
	public static void main(String[] args) {
		TwoDimensionArray tda= new TwoDimensionArray(3, 3);
		tda.insertionTDA(0, 2, 30);
		tda.insertionTDA(2, 0, 70);
		tda.insertionTDA(1, 1, 50);
		tda.insertionTDA(0, 2, 10);
		tda.insertionTDA(0, 3, 40);
		
		tda.trverse();
		tda.searchingTDA(70);
		tda.deletionTDA(0, 2);
		tda.trverse();
	}
}
