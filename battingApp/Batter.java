package battingApp;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Batter {
	Scanner input = new Scanner(System.in);
	ArrayList<Integer> atBat = new ArrayList<Integer>();
	int atBatSum = 0;
	int atBatCount = 0;
	int atBatEarned = 0;

	private String name;

	public Batter(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public double addAllAtBat() {

		for (int i = 0; i < atBat.size(); i++) {
			atBatSum += atBat.get(i);
		}
		return atBatSum;
	}

	public double addAllEarnedAtBat() {

		for (int i = 0; i < atBat.size() - 1; i++) {
			if (i > 0) {
				atBatEarned++;
			}
		}
		return atBatEarned;
	}

	public double calcBatAvg() {
		return (double) (addAllEarnedAtBat() / atBatCount);
	}

	public double calcSlugPer() {
		return (double) (addAllAtBat() / atBatCount);
	}

	private String formatNumber(double x) {
		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(3);
		return df.format(x);
	}

	public String getFormattedSlugPer() {
		return formatNumber(calcSlugPer());
	}

	public String getFormattedBatAvg() {
		return formatNumber(calcBatAvg());
	}

	{
		for (int i = 0; i < atBat.size(); i++) {
			System.out.println(atBat.get(i));
		}
	//System.out.println("Result for at-bat 0: ");
	// atBat.add(input.nextInt());
	int inputAtbat = Validator.getInt(input, "Result for at-bat 0: ");
	                                   
	atBat.add(inputAtbat);           //((I'm trying to validate but,
	atBatCount++;      //   it breaks my program ))
		String moreAtbat = Validator.yesOrNo(input, "Another at-bat? (Y/N)");
		while (moreAtbat.equalsIgnoreCase("y")) {
		//System.out.println("Result for at-bat " + atBat.size() + ": ");
		//	atBat.add(input.nextInt());
			inputAtbat = Validator.getInt(input, "Result for at-bat " + atBat.size() + ": ");
			atBat.add(inputAtbat);
			atBatCount++;
			moreAtbat = Validator.yesOrNo(input, "Another at-bat? (Y/N)");
			
			continue;
		}
		if (moreAtbat.equalsIgnoreCase("n")) {
		}
	
}
}
