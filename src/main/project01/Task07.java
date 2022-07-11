package main.project01;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a number");
		int num = input.nextInt();
		boolean prime = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		input.close();
	}
}
