package main;

public class Task03 {
	public static void main(String[] args) {

		int[][] nums = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90 }, { 110, 45, 125, 65, 15 } };
		int sum = 0;
		for (int x = 0; x < nums.length; x++) {
			for (int y = 0; y < nums[x].length; y++) {
				sum += nums[x][y];
			}
		}
		System.out.println("The sum of all numbers in 2D array is " + sum);
	}
}
