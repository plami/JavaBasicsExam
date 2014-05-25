
import java.math.BigDecimal;
import java.util.Scanner;

public class Tribonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		BigDecimal numberA = new BigDecimal(input.nextInt());
		BigDecimal numberB = new BigDecimal(input.nextInt());
		BigDecimal numberC = new BigDecimal(input.nextInt());
		int n = input.nextInt(); 
		BigDecimal sum = new BigDecimal(0);
		
		if (n == 1) {
			System.out.println(numberA);
		}
		else if(n == 2){
			System.out.println(numberB);
		}
		else if (n == 3) {
			System.out.println(numberC);
		} 
		else {
			for (int i = 3; i < n; i++) {
				
				sum = numberA.add(numberB).add(numberC);
				
				numberA = numberB;
				numberB = numberC;
				numberC = sum;
			}
			System.out.println(sum);
		}
	}
}