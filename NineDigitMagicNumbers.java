import java.util.Scanner;


public class NineDigitMagicNumbers {
	
	public static int SumOfDigits(int number){
		int first = number / 100;
		int second = number%100/10;
		int third = number%10;
		
		return first + second + third;
	}
	
	public static boolean isCorrect(int number){
		int first = number / 100;
		int second = number%100/10;
		int third = number%10;
		
		return first > 0 && first < 8 && second > 0 && second < 8 && third > 0 && third < 8;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int sum = input.nextInt();
		int diff = input.nextInt();
		boolean foundAny = false;
		
		for (int n1 = 111; n1 < 777; n1++) {
			int n2 = n1 + diff;
			int n3 = n1 + 2*diff;
			
		    if (SumOfDigits(n1) + SumOfDigits(n2) + SumOfDigits(n3) == sum 
				&& isCorrect(n1) && isCorrect(n2) && isCorrect(n3)) {
			foundAny = true;
			System.out.println(n1+""+n2+""+n3);
		    }
		}
		if (!foundAny) {
			System.out.println("No");
		}
	}
}
