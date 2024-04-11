package stack;

public class Stack {
	int[] arr;
	int topOfStack;

	public Stack(int size) {
		arr = new int[size];
		topOfStack = -1;
		System.out.println("The stack is created with size "+size);
	}
	
	public boolean isEmpty() {
		if(topOfStack==-1) return true;
		else return false;
	}
	
	public boolean isFull() {
		if(topOfStack==arr.length-1) return true;
		else return false;
	}
	
	public void Push(int value) {
		if(isFull()) System.out.println("The stack is full");
		else {
			arr[topOfStack+1]=value;
			topOfStack++;
			System.out.println("The value "+value+" is inserted");
		}
	}
	
	public int Pop() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty");
			return -1;
		} else {
			int value =arr[topOfStack];
			topOfStack--;
			return value;
		}
	}
	
	public int Peek() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty");
			return -1;
		} else {
			return arr[topOfStack];
		}
	}
	
	public void delete() {
		arr=null;
		System.out.println("The stack is deleted");
	}
}
