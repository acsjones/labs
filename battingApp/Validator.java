package battingApp;

import java.util.Scanner;

public class Validator {
	
	public static String yesOrNo(Scanner sc, String prompt) {
		System.out.println(prompt);
		while (true) {
			String s = sc.next().toLowerCase(); // read user entry
			sc.nextLine(); // discard any other data entered on the line
			if (s.startsWith("y")) {
				return "y";
			} else if (s.startsWith("n")) {
				return "n";
			} else {
				System.out.println("I didn't understand your response. Please enter 'yes' or 'no'.");
			}
		}
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getValInt(Scanner sc, String prompt, int min, int max) {

		int i = 0;
		while (true) {
			{
				i = getInt(sc, prompt);
				if (i >= 0 && i <= 4) {
					return i;
				} else {
					System.out.println("At-bat must be between 0 and 4.");
				}
			}
		}
	}

}