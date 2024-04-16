package queue;

public class Mainclass {
	public static void main(String[] args) {
		Queue queue=new Queue(5);
		
		queue.isFull();
		queue.isEmpty();
		System.out.println("----------------");
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		System.out.println("-----------------");
		queue.deQueue();
		queue.deQueue();
		System.out.println("------------------");
		queue.peek();
	}
}
