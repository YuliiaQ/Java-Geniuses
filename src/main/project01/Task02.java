package main.project01;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int el = scanner.nextInt();
		scanner.nextLine();

		String[] countries = new String[el];
		for (int i = 0; i < el; i++) {
			System.out.println("Enter the name of country");
			countries[i] = scanner.nextLine();
		}

		String capital;
		for (int i = 0; i < el; i++) {
			switch (countries[i]) {
			case "Mexico":
				capital = "Mexico City";
				break;
			case "Peru":
				capital = "Lima";
				break;
			case "Honduras":
				capital = "Tegucigalpa";
				break;
			case "Colombia":
				capital = "Bogota";
				break;
			case "El Salvador":
				capital = "San Salvador";
				break;
			case "Panama":
				capital = "Panama City";
				break;
			case "Chili":
				capital = "Santiago";
				break;
			case "Costa Rica":
				capital = "San Jose";
				break;
			case "Nicaragua":
				capital = "Managua";
				break;
			case "Brazil":
				capital = "Brasilia";
				break;
			default:
				capital = "unknown";
			}
			System.out.println("The capital of the coutry " + countries[i] + " is " + capital);
		}
		scanner.close();

	}

}
