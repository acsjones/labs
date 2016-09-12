import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nextround = "y";
		int totalgames = 0;
		int youwin = 0;
		int youlose = 0;
		int youdraw = 0;
		System.out.println("Let's Roshambo!");
		System.out.println();
		System.out.print("Enter your name: ");
		String userName = sc.nextLine();
		System.out.println();
		System.out.print("Would you like to play against rock or random? ");
		String choice = sc.next();
		System.out.println();
		// get program to accept any case of "rock" or "random"
		Player opponent;
		switch (choice) {
		case "random":
			opponent = new RandomPlayer("Miss Random");
			break;
		case "rock":
			opponent = new RockPlayer("Mister Rock");
			break;
		default:
			sc.close();
			throw new IllegalArgumentException("Wrong.");

		}

		while (nextround.equalsIgnoreCase("y") || nextround.equalsIgnoreCase("yes")) {
		
			Player player = new PlayerGet("");
			Roshambo play = player.generateRoshambo();
			Roshambo oplay = opponent.generateRoshambo();
			System.out.println("-------------------------------------");
			System.out.println(userName + " : " + play);
			System.out.println(opponent.getPlayerName() + ": " + (opponent.generateRoshambo()));
			System.out.println();

			if (oplay == play) {
				System.out.println("Draw!");
				youdraw++;
			}
			if (play == Roshambo.SCISSORS && oplay == Roshambo.ROCK) {
				System.out.println("Rock beats scissors. You lose.");
				youlose++;
			}
			if (play == Roshambo.PAPER && oplay == Roshambo.ROCK) {
				System.out.println("Paper beats rock! You win!");
				youwin++;
			}
			if (play == Roshambo.PAPER && oplay == Roshambo.SCISSORS) {
				System.out.println("Scissors beats paper. You lose.");
				youlose++;
			}
			if (play == Roshambo.ROCK && oplay == Roshambo.SCISSORS) {
				System.out.println("Rock beats scissors! You win!");
				youwin++;
			}
			if (play == Roshambo.ROCK && oplay == Roshambo.PAPER) {
				System.out.println("Rock beats paper. You win!");
				youwin++;
			}
			if (play == Roshambo.SCISSORS && oplay == Roshambo.PAPER) {
				System.out.println("Scissors beats paper. You win!");
				youwin++;
			}
			System.out.println("Try again?");
			System.out.println();
			nextround = sc.next();
			totalgames++;

		}
		if (nextround.equalsIgnoreCase("n") || nextround.equalsIgnoreCase("no")) {
			if (youwin >= 1) {
				System.out.println("Bye, " + userName + "! You won " + youwin + " out of " + totalgames + " games! :)");
			}
			if (youwin == 0 && youlose >= 1) {
				System.out.println(
						"Tough luck, " + userName + ". You lost " + youlose + " out of " + totalgames + " games. :(");
			}
			if (youdraw >= 1 && youwin == 0 && youlose == 0) {
				System.out.println("All " + youdraw + " out of " + totalgames + " games were ties!");
				sc.close();
			}
		}
	}
}