package main.project01;

public class Task09 {
	public static void main(String[] args) {
		int[] number = { 54, 38, 76, 29, 45 };
		int max = number[0];
		int min = number[0];
		for (int i = 1; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			} else if (number[i] < min) {
				min = number[i];

			}
		}
		System.out.println("Maximum number in array is " + max + " and minimum number is " + min);
	}
}
