package stack;

import java.util.Stack;

class Activity {
	private String name;

	public Activity(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class InstagramActivity {
	private Stack<Activity> stack;
	private String currentactivity;

	public InstagramActivity() {
		stack = new Stack<>();
		currentactivity = "home";
	}

	public void addActivity(String act) {

		Activity a = new Activity(currentactivity);
		stack.push(a);
		currentactivity = act;
		System.out.println("the activity is - " + currentactivity);
	}

//	public Stack<Activity> recentActivity() {
//		return stack;
//	}

	public void recentActivity() {
		for (Activity activity : stack) {
			System.out.println("Recent Activities : " + activity.getName());
		}
	}

	public void undoActivity() {
		if (!stack.isEmpty()) {
			Activity activity = stack.pop();
			System.out.println("The undo activity is : " + activity.getName());
		} else {
			System.out.println("no page to undo ");
		}
	}

	public void currentActivity() {
		Activity activity = stack.peek();
		System.out.println("Current Activity is : " + activity.getName());
	}
}
