package twodimensionalarray;

public class TwoDimensionArray {
	int[][] arr;

	public TwoDimensionArray(int rsize, int csize) {
		arr = new int[rsize][csize];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}

	public void insertionTDA(int row, int col, int value) {
		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("the value is inserted");
			} else {
				System.out.println("the block is already filled");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid loction");
		}
	}

	public void trverse() {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
		}
	}

	public void searchingTDA(int searchingvalue) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == searchingvalue) {
					System.out.println("\nThe value is present in the index of " + row+", " + col);
					return;
				}
			}
		}
		System.out.println("The value is not present");
	}

	public void deletionTDA(int rloc, int cloc) {
		try {
			if (arr[rloc][cloc] != Integer.MIN_VALUE) {
				arr[rloc][cloc] = Integer.MIN_VALUE;
				System.out.println("The value is deleted");
			} else {
				System.out.println("Its already deleted");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid location");
		}
	}
}
