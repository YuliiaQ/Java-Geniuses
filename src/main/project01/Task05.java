package main.project01;

public class Task05 {
	public static void main(String[] args) {
		int[][] nums = { { 3, 6, 4, 8, 5 }, { 7, 9, 2, 4, 8 }, { 8, 3, 1, 5, 4 } };
		int sumE = 0;
		int sumO = 0;
		for (int u = 0; u < nums.length; u++) {
			for (int o = 0; o < nums[u].length; o++) {
				if (nums[u][o] % 2 == 0) {
					sumE += nums[u][o];
				} else if (nums[u][o] % 2 != 0) {
					sumO += nums[u][o];
				}

			}
		}
		System.out.println("The sum of even numbers is 2D array is " + sumE + " and sum of odd numbers is " + sumO);
		System.out.println("Sum of even and odd numbers is " + (sumE + sumO));

	}
}
