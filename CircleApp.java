import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle();
		Scanner sc = new Scanner(System.in);
		String anotherOne = "yes";

		while (anotherOne.equalsIgnoreCase("y") || (anotherOne.equalsIgnoreCase("yes"))) {
			System.out.println("Enter a radius:");
			while (!sc.hasNextInt()) {
				System.out.println("That wasn't a number. Try again.");
				sc.next();
			}
			circle.radius = sc.nextDouble();
			Circle.objectCount++;
			System.out.println("Area: " + circle.getFormattedArea());
			System.out.println("Circumference: " + circle.getFormattedCircumference());

			System.out.println("Continue? Y/N:");

			while (!sc.hasNext("n") && !sc.hasNext("no") && !sc.hasNext("y") && !sc.hasNext("yes") && !sc.hasNext("YES")
					&& !sc.hasNext("NO") && !sc.hasNext("No") && !sc.hasNext("Yes") && !sc.hasNext("nO")
					&& !sc.hasNext("yeS") && !sc.hasNext("yES") && !sc.hasNext("YEs") && !sc.hasNext("Y")
					&& !sc.hasNext("N")) {
				System.out.println("That wasn't a valid answer. Try again");
				sc.next();
			}
			anotherOne = sc.next();
		}
		if (anotherOne.equalsIgnoreCase("n") || (anotherOne.equalsIgnoreCase("no"))) {
			System.out.println("Goodbye! You made " + Circle.getObjectCount() + " circles!");
			sc.close();
		}

	}
}
