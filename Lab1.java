

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus' Room Detail Generator!");
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))  {
		
		System.out.println();
		
		System.out.println("Please enter the width.");
		double width = sc.nextDouble();
		
		System.out.println("Please enter the length.");
		double length = sc.nextDouble();
		
		double area = width * length;
		
		System.out.println("The area of this room is");
		System.out.println(area);
		
		double perimeter = width + width + length + length;
				
		System.out.println("The perimeter of this room is");
		System.out.println(perimeter);
		
		System.out.print("Would you like to measure another room? Y/N");
		
		
		choice = sc.next();
		
		
		}
		while (choice.equalsIgnoreCase("n"))  {
			System.out.println("Goodbye.");	
		sc.close();
		break;
	
		}
		}
			

	}
