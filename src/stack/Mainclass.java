package stack;

public class Mainclass {
	public static void main(String[] args) {
		Stack stack=new Stack(3);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		
		stack.Push(10);
		stack.Push(20);
		stack.Push(30);
		stack.Push(40);
		stack.Push(50);
		
		stack.Push(60);
		
		System.out.println(stack.Pop());
		System.out.println(stack.Pop());
		System.out.println(stack.Pop());
		System.out.println(stack.Pop());
		System.out.println(stack.Pop());
		System.out.println(stack.Pop());
		
		System.out.println(stack.Pop());
		
		System.out.println(stack.Peek());
		stack.delete();
	}
}
