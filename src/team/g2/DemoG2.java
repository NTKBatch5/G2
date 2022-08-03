package team.g2;

public class DemoG2 {

	public static void main(String[] args) {
		System.out.println("Test");

		System.out.println("Nasrin is testing");

		funStuff();
	}

	public static void funStuff() {
		System.out.println("Prajita Testing......");
	}

	// testing y seyar

	public static void funStuff2() {
		System.out.println("Nasrin Testing......");
	 
		DemoG2 obj  = new DemoG2();
		obj.NewMethod();
		
	}
	public void NewMethod() {
		String c1= "Nasrin said call";
		
				System.out.println("Gonzalo testiingg... 08-01-2022 11:55:00" + c1);
	}
	
	public static void ConflictTry() {
		System.out.println("ConflictsRule");
	 
		DemoG2 obj  = new DemoG2();
		obj.ConflictTry();
		
	}

}
