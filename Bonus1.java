

import java.util.Scanner;

public class Bonus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int objectCount = 0;
		System.out.println("Welcome to the Letter Grade Converter!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String userInput = "y";
		while (userInput.equalsIgnoreCase("y")) {
		System.out.println("Enter a numerical grade:");
		int numbergrade = sc.nextInt();
		objectCount++;
		if (numbergrade >= 88 && numbergrade <= 100)
			System.out.println("Letter Grade:" + " " + "A");
		
		if (numbergrade >= 80 && numbergrade <= 87)
			System.out.println("Letter Grade:" + " " + "B");
		
		if (numbergrade >= 67 && numbergrade <= 79)
			System.out.println("Letter Grade:" + " " + "C");

		if (numbergrade >= 60 && numbergrade <= 66)
			System.out.println("Letter Grade:" + " " + "D");
		
		if (numbergrade <= 59)
			System.out.println("Letter Grade:" + " " + "F");


		System.out.println("Would you like to continue? (Y/N)");
		userInput = sc.next();
		
		while (userInput.equalsIgnoreCase("n")) {
		System.out.println("Goodbye. You've graded " + objectCount +  " papers.");
		break;
		}
		}
		sc.close();
	}
	

}
