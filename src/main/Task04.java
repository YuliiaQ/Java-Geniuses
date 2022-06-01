package main;

public class Task04 {

	public static void main(String[] args) {

		int[][] num = { { 3, 6, 4, 8, 5 }, { 7, 9, 2, 4, 8 }, { 8, 3, 1, 5, 4 } };
		for (int a = 0; a < num.length; a++) {
			for (int e = 0; e < num[a].length; e++) {
				if (num[a][e] % 2 == 0) {
					System.out.print(num[a][e] + " ");
				}
			}
		}
	}
}
