package queue;

import java.util.LinkedList;
import java.util.Queue;

public class OperaticSystem {
	private Queue<String> queue;
	private String task;
	
	public OperaticSystem() {
		queue =new LinkedList<>();
	}
	
	public void addTask(String taskname) {
		queue.add(taskname);
		System.out.println("The "+ taskname+ " task is added");
	}
	
	public void completedTask() {
		if(!queue.isEmpty()) {
			String taskname=queue.poll();
			System.out.println(taskname+ " is successfully completed");
		} else {
			System.out.println("The is queue is empty");
		}
	}
	
	public void currentTask() {
		if(!queue.isEmpty()) {
			String taskname=queue.peek();
			System.out.println(taskname+ " is current task");
		} else {
			System.out.println("The is empty");
		}
	}
	
	public void removeTask() {
		if(!queue.isEmpty()) {
			System.out.println(queue.remove()+" is removed from task");
		} else {
			System.out.println("The queue is empty");
		}
	}
}
