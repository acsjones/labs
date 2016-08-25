
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println();

		System.out.println("You will roll two dice.");
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("How many sides should each die have?");
			int number = sc.nextInt();

			System.out.println("Roll results:");
			System.out.println(cube(number));
			System.out.println(cube(number));
			
			if ((cube(number) ==1)) {
				System.out.println("Lucky! Snake eyes!");
			}

			System.out.println("Try again?");
			choice = sc.next();

		}

	}

	public static int cube(int number) {
		return (int) (Math.random() * number) + 1;

	}

}
