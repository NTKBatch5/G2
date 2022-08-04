package team.g2;

public class DemoG2 {

	public static void main(String[] args) {
		// Nasrin
		DemoG2 obj = new DemoG2();
		obj.doubleChar("The");

	}

	// Nasrin
	// https://codingbat.com/prob/p165312
	public String doubleChar(String str) {
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			str2 = str2 + str.charAt(i) + str.charAt(i);
		}
		return str2;
	}

}
