package stack;

import java.util.Stack;

public class WebHistory {
	private Stack<String> backwardStack;
	private Stack<String> forwardStack;
	private String currentPage;

	public WebHistory() {
		backwardStack = new Stack<>();
		forwardStack = new Stack<>();
		currentPage = "home page";
	}

	public void visitPage(String page) {
		backwardStack.push(currentPage);
//		forwardStack.clear();
		currentPage = page;
		System.out.println("The visited page is " + page);
	}

	public String getCurrentpage() {
		return currentPage;
	}

	public void goBack() {
		if (backwardStack == null) {
			System.out.println("the stack is empty");
		}
		else if (!backwardStack.isEmpty()) {
			forwardStack.push(currentPage);
			currentPage = backwardStack.pop();
			System.out.println("Pervious page was " + currentPage);
		} else {
			System.out.println("No pages left, you reched to main page");
		}
	}

	public void goForward() {
		if (forwardStack == null) {
			System.out.println("the stack is empty");
		}
		else if (!forwardStack.isEmpty()) {
			backwardStack.push(currentPage);
			currentPage = forwardStack.pop();
			System.out.println("This was your next page " + currentPage);
		} else {
			System.out.println("No pages left to go forwards");
		}
	}

	public void deleteStack() {
		backwardStack = null;
		forwardStack = null;
		System.out.println("The History is deleted");
	}
}
