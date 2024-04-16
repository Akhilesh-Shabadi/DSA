package queue;

public class OperatingsystemMainclass {
	public static void main(String[] args) {
		OperaticSystem operaticSystem = new OperaticSystem();
		
		operaticSystem.addTask("sendFile");
		operaticSystem.addTask("printFile");
		operaticSystem.addTask("receiveFile");
		operaticSystem.addTask("deleteFile");
		System.out.println("--------------------");
		operaticSystem.completedTask();
//		operaticSystem.completedTask();
		System.out.println("--------------------");
		operaticSystem.currentTask();
		System.out.println("--------------------");
		operaticSystem.removeTask();
		System.out.println("--------------------");
		operaticSystem.completedTask();
		System.out.println("---------------------");
		operaticSystem.currentTask();
	}
}
