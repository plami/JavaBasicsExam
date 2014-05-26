import java.util.Scanner;


public class MagicStrings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int diff = input.nextInt();
		
		String[] letter = {"k", "n", "p", "s"}; //Ctrl  + F(replace ' with ")
		int [] letterValues = {1, 4, 5, 3};
		boolean foundResult = false;
		
		for (int i = 0; i < letter.length; i++) {
			for (int j = 0; j < letter.length; j++) {
				for (int j2 = 0; j2 < letter.length; j2++) {
					for (int k = 0; k < letter.length; k++) {
						for (int k2 = 0; k2 < letter.length; k2++) {
							for (int l = 0; l < letter.length; l++) {
								for (int l2 = 0; l2 < letter.length; l2++) {
									for (int m = 0; m < letter.length; m++) {
										
										String wholeSequence = 
												letter[i] + letter[j] +
												letter[j2] + letter[k] +
												letter[k2] + letter[l] +
												letter[l2] + letter[m];
										
										int firstFourLetters = letterValues[m] +
												letterValues[l2] +
												letterValues[l] +
												letterValues[k2];
										int secondFourLetters = letterValues[k]+
												letterValues[j2] +
												letterValues[j] +
												letterValues[i];
										if (firstFourLetters - secondFourLetters == diff || 
												secondFourLetters - firstFourLetters == diff) {
											foundResult = true;
											System.out.println(wholeSequence);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (!foundResult) {
			System.out.println("No");
		}
	}

}
