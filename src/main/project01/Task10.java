package main.project01;

public class Task10 {
	public static void main(String[] args) {
		int[] Num = { 12, 38, 73, 40, 365, 895, 185, 348, 234 };
		int largestNum = 0;
		int secLargestNum = 0;
		
		for (int i = 0; i < Num.length; i++) {
			if (Num[i] > largestNum) {
				largestNum = Num[i];
			}
			for (int x = 0; x < Num.length; x++) {
				if (Num[x] > secLargestNum && Num[x] < largestNum) {
					secLargestNum = Num[x];
				}

			}
		}
		System.out.println("The Second largest number is: " + secLargestNum);
	}
}
