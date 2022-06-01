package main;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many terms of Fibonacci numbers do you want to see?");
		int termNum = scanner.nextInt();
		System.out.println("Your Fibonacci numbers are: ");
		for (int i = 1; i <= termNum; i++) {
			System.out.print(num1 + " ");
			int nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
		}
		scanner.close();
	}
}
