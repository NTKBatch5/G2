package team.g2;

public class DemoG2 {

	public static void main(String[] args) {

		DemoG2 obj = new DemoG2();
		obj.doubleChar("The");

		int arr[] = { 1, 56, 74, 85, 4, 7, 3 };
		// prajita
		obj.maxSpan(arr);

		System.out.println("123");

		// adding new line
	}

	public static void prajita() {
		System.out.println("prajita...");
	}

	public static void multiply() {
		System.out.println("Multiplying..");
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

	// Nasrin
	public static int[] maxEnd3(int[] nums) {

		int temp = Math.max(nums[0], nums[2]);

		for (int i = 0; i < 3; i++) {
			nums[i] = temp;
		}
		return nums;
	}

	public static void nasrin() {
		System.out.println("Nasrin is Testing");
	}

	// Seyar
	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
		// change
		// changes made
	}

	// Prajita Coding bat
	public int maxSpan(int[] nums) {
		int result = 0;
		int larg = 0;
		for (int x = 0; x < nums.length; x++) {
			for (int i = nums.length - 1; i >= 0; i--) {
				if (nums[x] == nums[i]) {
					result = i - x + 1;
					break;
				}
			}
			if (larg < result) {
				larg = result;
			}
		}

		return larg;
	}

	//prajita changing more 
// 									⎛⎝(⌒ⱅ⌒ )⎠⎞  Gonzalos CodingBat    ⎛⎝(•ⱅ•)⎠⎞ 
	public int start1(int[] a, int[] b) {

		int count = 0;

		if (a.length > 0 && a[0] == 1) // a.length > 0-- taking care of first array ( a )is any length || and seeing if

			count++; // add to the count

		if (b.length > 0 && b[0] == 1) // b.length > 0-- taking care of 2nd array ( b )is any length || and seeing if
										// first index [0] is = 1
			count++; // add to the count

		return count;
	}
}
