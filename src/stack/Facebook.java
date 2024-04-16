package stack;

import java.util.Stack;

class AllActivity {
	private String allActivity;
	private int values;

	public AllActivity(String allActivity, int values) {
		this.allActivity = allActivity;
		this.values = values;
	}

	public String getAllActivity() {
		return allActivity;
	}

	public int getValues() {
		return values;
	}
}

public class Facebook {
	private Stack<AllActivity> activities;
	private String currentPage;

	public Facebook() {
		activities = new Stack<AllActivity>();
		currentPage = "Home Page";
	}

	public void addActivity(String page, int followers) {
		AllActivity activity = new AllActivity(currentPage, followers);
		activities.push(activity);
		currentPage = page;
		System.out.println("-> " + page);

	}

	public void recentActivity() {
		for (AllActivity allActivity : activities) {
			System.out
					.println("Recent activites are :" + allActivity.getAllActivity() + " - " + allActivity.getValues());
		}
	}

	public void undoActivity() {
		if (!activities.isEmpty()) {
			AllActivity activity = activities.pop();
			System.out.println("Undo activity is : " + activity.getAllActivity() + " - " + activity.getValues());
		}
	}

	public Stack<AllActivity> allActivity() {
		return activities;
	}

	public String getcurrntPage() {
		return currentPage;
	}

}
