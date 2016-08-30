import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println();

		System.out.println("Enter a single word to be translated:");
		String tobeTranslated = sc.nextLine();
		String result1 = result(tobeTranslated);
		String result2 = result(result1);
		String result3 = result(result2);
		String result4 = result(result3);
		// when 1st letter is vowel
		if (tobeTranslated.startsWith("a") || tobeTranslated.startsWith("e") || tobeTranslated.startsWith("i")
				|| tobeTranslated.startsWith("o") || tobeTranslated.startsWith("u")) {
			System.out.println(tobeTranslated + "way");
		}
		// when 2nd letter is vowel
		else {

			if (result1.startsWith("a") || result1.startsWith("e") || result1.startsWith("i") || result1.startsWith("o")
					|| result1.startsWith("u"))
				System.out.println(result1 + "ay");

			else {
				if (result2.startsWith("a") || result2.startsWith("e") || result2.startsWith("i")
						|| result2.startsWith("o") || result2.startsWith("u"))
					System.out.println(result2 + "ay");

				else {
					if (result3.startsWith("a") || result3.startsWith("e") || result3.startsWith("i")
							|| result3.startsWith("o") || result3.startsWith("u"))
						System.out.println(result3 + "ay");

					else {
						if (result4.startsWith("a") || result4.startsWith("e") || result4.startsWith("i")
								|| result4.startsWith("o") || result4.startsWith("u"))
							System.out.println(result4 + "ay");
					}

				}
			}
		}
	}

	public static String result(String tobeTranslated) {
		String answer1 = tobeTranslated.toLowerCase().substring(1, tobeTranslated.length());
		String x = tobeTranslated.toLowerCase().substring(0, 1);
		return answer1 + x;

	}

}
