import java.util.Scanner;

public class JoroFootballPlayer {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String t = input.nextLine();
		
		int p = input.nextInt();
		int h = input.nextInt();
		int addPlays = 0;
		
		if ("t".equals(t)){
			addPlays = 3;
		}
			double plays = h + (double)2/3*(52 - h) + (double)1/2 * p + addPlays;
			System.out.println((int)plays);
	}
}