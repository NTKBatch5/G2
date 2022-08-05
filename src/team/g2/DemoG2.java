package team.g2;

public class DemoG2 {

	public static void main(String[] args) {
		// Nasrin
		DemoG2 obj = new DemoG2();
		obj.doubleChar("The");

		int[] arr = { 2, 3, 45, 6, 7 };
		countEvens(arr);

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

	// Seyar
	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];

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

	// Nasrin
	public static int countEvens(int[] nums) {
		int numEven = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0)
				numEven++;

		}
		return numEven;

	}

}
