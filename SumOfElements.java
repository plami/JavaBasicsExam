import java.util.Scanner;


public class SumOfElements {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] numbers = input.nextLine().split(" ");
		
		int max = Integer.MIN_VALUE;
		long sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			int currentNumber = Integer.parseInt(numbers[i]);
			sum += currentNumber;
			if(currentNumber > max){
				max = currentNumber;
			}
		}
		
        if (sum - max == max) {
		    System.out.println("Yes, sum=" + max);
		} 
		else {
			long diff = Math.abs((sum-max) - max);
			System.out.println("No, diff=" + diff);
		}
	}
}