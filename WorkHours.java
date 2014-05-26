import java.util.Scanner;


public class WorkHours {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();
		int d = input.nextInt();
		double p = input.nextDouble()/100;
		
		double daysLeft = d - (d * 0.1);
		double workingHours = daysLeft * 12;
		int efficientHours = (int) (workingHours * p);
		
		int difference = efficientHours - h;
		
		if (difference < 0) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		System.out.println(difference);
	}
}