package stack;

public class WebhistoryMainclass {
	public static void main(String[] args) {
		WebHistory history = new WebHistory();

		history.visitPage("filkart");
		history.visitPage("mobilepage");
		history.visitPage("realmepage");
		
		System.out.println("-----------------");
		
		System.out.println("The current page is "+history.getCurrentpage());
		
		System.out.println("-----------------");
		
		history.goBack();
		history.goBack();
		
		System.out.println("-----------------");
		
		System.out.println("The current page is "+history.getCurrentpage());
		
		System.out.println("-----------------");
		
		history.goForward();
		
		System.out.println("-----------------");
		
		System.out.println("The current page is "+history.getCurrentpage());
		
		System.out.println("-----------------");
		
		history.deleteStack();
		
		System.out.println("-----------------");
		
		System.out.println("The current page is "+history.getCurrentpage());
		
		System.out.println("-----------------");
//		
//		history.goBack();
//		
//		System.out.println("-----------------");
//		
//		history.goForward();
	}
}
