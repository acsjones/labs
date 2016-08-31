import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] name = { "void", "Joe", "Mary", "Sean", "Jessica", "Tyrone" };
		String[] home = { "void", "Detroit", "Grand Rapids", "Lansing", "Ann Arbor", "West Bloomfield" };
		String[] food = { "void", "pizza", "sushi", "burgers", "stir fry", "sandwiches" };
		String answer = "yes";


		System.out.println("Welcome to our Experience IT/Java Class!");

		while (true) {
			System.out.println("Please enter a student number from 1-5.");

			try {
				int studentNumber = sc.nextInt();

				if (studentNumber > 5) {
					System.out.println("There are only 5 students in the class.");
				}

				if (studentNumber < 1) {
					System.out.println("This is not a valid number.");
				}
				if (studentNumber > 0 && studentNumber < 6) {

					System.out.println("Student " + studentNumber + " is " + name[studentNumber]
							+ ". What would you like to know about " + name[studentNumber]
							+ "? (Enter 'hometown' or 'food').");
					String nextInput = sc.next();

					if (nextInput.equals("hometown")) {
						System.out.println(name[studentNumber] + " is from " + home[studentNumber] + ".");

					}
					if (nextInput.equals("food")) {
						System.out.println(name[studentNumber] + "'s favorite food is " + food[studentNumber] + ".");

					}
					if (!(nextInput.equals("food")) && !(nextInput.equals("hometown"))) {
						throw new IllegalArgumentException("Only favorite food and hometown are available.");
						
					}

					System.out.println("Would you like to know about another student?");
					answer = sc.next();

				}
				if (answer.equalsIgnoreCase("no")) {
					System.out.println("See ya.");
					sc.close();
					break;
				}

			}

			catch (InputMismatchException ex) {
				System.out.println("Not a number. Try again.");
				sc.next();

			}

		}
	}
}
