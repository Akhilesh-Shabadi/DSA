package stack;

import java.util.Stack;

public class FacebookMainclass {
	public static void main(String[] args) {
		Facebook facebook = new Facebook();
		
		System.out.println("-----------");
		
		System.out.println(facebook.getcurrntPage());
		
		System.out.println("-----------");
		
		facebook.addActivity("Story", 1000);
		facebook.addActivity("Videos", 1500);
		
		System.out.println("-----------");
		
		System.out.println(facebook.getcurrntPage());
		
		System.out.println("-----------");
		
		facebook.addActivity("Friend Request", 729);
		facebook.addActivity("MarketPlace", 120);
		facebook.addActivity("Reels", 30);
		facebook.addActivity("Profile Visit", 200);
		facebook.addActivity("Notification", 20);
		facebook.addActivity("Menu", 1);
		facebook.addActivity("Chating", 100);
		
		System.out.println("-----------");
		
		System.out.println(facebook.getcurrntPage());
		
		System.out.println("-----------");
		
		facebook.recentActivity();

		Stack<AllActivity> s1 = facebook.allActivity();
		for (AllActivity activity : s1) {
			System.out.println("- : " + activity.getAllActivity() + " - " + activity.getValues());
		}
	}
}
