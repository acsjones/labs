
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
			int answer = roll(number);
			int answer2 = roll(number);
			System.out.println("Roll results:");
			System.out.println(answer);
			System.out.println(answer2);

			if (answer == 1 && answer2 == 1) {
				System.out.println("Lucky! Snake eyes!");
			}
			if (answer == 6 && answer2 == 6) {
				System.out.println("Wow! Box Car!");
			}

			System.out.println("Try again?");
			choice = sc.next();

		}
		sc.close();
	}

	public static int roll(int number) {
		return (int) (Math.random() * number) + 1;

	}

}
