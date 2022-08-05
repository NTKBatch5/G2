package team.g2;

public class DemoG2 {

	public static void main(String[] args) {
		
	     System.out.println("Seyar");
		// Nasrin
		DemoG2 obj = new DemoG2();
		obj.doubleChar("The");
         
		int [] arry = {0, 1, 2};
		obj.sum3(arry);
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

// 									⎛⎝(⌒ⱅ⌒ )⎠⎞  Gonzalos CodingBat    ⎛⎝(•ⱅ•)⎠⎞ 
	public int start1(int[] a, int[] b) {

		int count = 0;

		if (a.length > 0 && a[0] == 1) // a.length > 0-- taking care of first array ( a )is any length || and seeing if
										// first index [0] is = 1
			count++; // add to the count

		if (b.length > 0 && b[0] == 1) // b.length > 0-- taking care of 2nd array ( b )is any length || and seeing if
										// first index [0] is = 1
			count++; // add to the count

		return count;
	}
}
