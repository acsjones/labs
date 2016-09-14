package battingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class BatterApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String moreBatter = "y";
	
		  ArrayList<Batter> batterList = new ArrayList<Batter>();
		System.out.println("Welcome to the Batting Average Calculator!");
		System.out.println();
		while (moreBatter.equalsIgnoreCase("y")) {
		System.out.println("Enter the player's name: ");
		batterList.add(new Batter(input.next()));
		moreBatter = Validator.yesOrNo(input, "Another batter? (Y/N)");
		System.out.println();
		if (moreBatter.equalsIgnoreCase("n")) {
		for (Batter player : batterList){
	    		  System.out.println("Name: " + player);
	    		  System.out.println("Batting Average: " + player.getFormattedBatAvg());
	    		  System.out.println("Slugging Percentage: " + player.getFormattedSlugPer());
	    		  System.out.println();
	    	  }
		input.close();
		}
		}

	

	}

}
