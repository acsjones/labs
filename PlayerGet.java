import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayerGet extends Player {
	Scanner sc = new Scanner(System.in);
	String userInput = sc.next();
	char firstLetter = userInput.charAt(0);

	public PlayerGet(String playerName) {
		super(playerName);

	}

	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	@Override
	public Roshambo generateRoshambo() {

		if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S' || firstLetter == 'r' || firstLetter == 'p'
				|| firstLetter == 's') {
			switch (firstLetter) {
			case 'R':
				return Roshambo.ROCK;
			case 'P':
				return Roshambo.PAPER;
			case 'S':
				return Roshambo.SCISSORS;
			case 'r':
				return Roshambo.ROCK;
			case 'p':
				return Roshambo.PAPER;
			case 's':
				return Roshambo.SCISSORS;
			}

		}

		return null;

	}

}
