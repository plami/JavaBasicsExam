import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean isTriangle = true;
		
		int Ax = input.nextInt();
		int Ay = input.nextInt();
		int Bx = input.nextInt();
		int By = input.nextInt();
		int Cx = input.nextInt();
		int Cy = input.nextInt();
		
		double distAB = getDistance(Ax, Ay, Bx, By);
		double distBC = getDistance(Bx, By, Cx, Cy);
		double distAC = getDistance(Ax, Ay, Cx, Cy);
		
		if (distAB + distBC <= distAC) {
			isTriangle = false;
		}
		if (distBC + distAC <= distAB) {
			isTriangle = false;
		}
		if (distAC + distAB <= distBC) {
			isTriangle = false;
		}
		if (!isTriangle) {
			System.out.println("No");
			System.out.printf("%.2f", distAB);
		}
		else {
			System.out.println("Yes");
			System.out.printf("%.2f", getTriangleArea(distAB, distAC, distBC));
		}
	}

	public static double getTriangleArea(double distAB, double distAC, double distBC) {
		
		double halfArea = (distAB + distAC + distBC)/2;
		double Area = halfArea*(halfArea - distAB)*(halfArea - distAC)*(halfArea - distBC);
				
		return Math.sqrt(Area);
	}

	private static double getDistance(int Ax, int Ay, int Bx, int By) {
		
		double result = Math.pow(Bx - Ax, 2) + Math.pow(By - Ay, 2);
		
		return Math.sqrt(result);
	}
}
