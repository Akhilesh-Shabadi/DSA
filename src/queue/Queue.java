package queue;

public class Queue {
	int[] queue;
	int beginingofQueue;
	int topOfQueue;

	public Queue(int size) {
		this.queue = new int[size];
		this.beginingofQueue = -1;
		this.topOfQueue = -1;
		System.out.println("The Queue is created with the size of "+size);
	}
	
	public boolean isFull() {
		if(topOfQueue==queue.length-1) return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(beginingofQueue==-1||beginingofQueue==queue.length) return true;
		return false;
	}
	
	public void enqueue(int value) {
		if(isFull()) {
			System.out.println("The Queue is full");
		} else if(beginingofQueue==-1) {
			beginingofQueue=0;
			topOfQueue++;
			queue[topOfQueue]=value;
			System.out.println("The value " + value + " is inserted");
		} else {
			topOfQueue++;
			queue[topOfQueue]=value;
			System.out.println("The value " + value + " is inserted");
		}
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("The Queue is Empty");
		} else {
			int value=queue[beginingofQueue];
			beginingofQueue++;
			if(beginingofQueue>topOfQueue) {
				beginingofQueue=topOfQueue=-1;
			}
			System.out.println("The dequeue is : "+value);
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("The queue is empty");
		} 
		System.out.println(queue[beginingofQueue]);
	}
}
