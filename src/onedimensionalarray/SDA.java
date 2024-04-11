package onedimensionalarray;

public class SDA {
	int[] arr;

	public SDA(int size) {
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void insertionSDA(int location, int value) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = value;
				System.out.println("The value inserted successfully");
			} else {
				System.out.println("The box is already filled");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid location");
		}
	}
	
	public void trverse() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void searchingSDA(int searchvalue) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchvalue) {
				System.out.println("\nThe value is present in the index of "+i);
				return;
			}
		}
		System.out.println("The value is not present");
	}
	
	public void deletionSDA(int location) {
		try {
			if(arr[location]!=Integer.MIN_VALUE) {
				arr[location]=Integer.MIN_VALUE;
				System.out.println("The value is deleted");
			} else {
				System.out.println("The location already deleted");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid location");
		}
	}
}
