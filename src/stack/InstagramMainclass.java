package stack;

public class InstagramMainclass {
	public static void main(String[] args) {
		InstagramActivity acti = new InstagramActivity();

		acti.addActivity("post");
		acti.addActivity("like");
		acti.addActivity("addtostory");
		acti.addActivity("share link");

//		acti.currentActivity();
		acti.recentActivity();

		acti.undoActivity();
//		acti.undoActivity();
//		acti.undoActivity();

		acti.currentActivity();

//		System.out.println("the recent activity: "+ acti.recentActivity());

//		acti.currentActivity();
	}
}
